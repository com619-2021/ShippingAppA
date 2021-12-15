package uk.ac.solent.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"uk.ac.solent.dao.route",
        "uk.ac.solent.dao.booking", "uk.ac.solent.dao.ship", "uk.ac.solent.dao.user"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"uk.ac.solent.dao.route",
        "uk.ac.solent.dao.booking", "uk.ac.solent.dao.ship", "uk.ac.solent.dao.user"
})
public class PersistenceJPAConfig {

    @Autowired
    private Environment env;

    // beans
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("uk.ac.solent.model.booking",
                "uk.ac.solent.model.route",
                "uk.ac.solent.model.ship",
                "uk.ac.solent.model.user");

        final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());

        return em;
    }

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        if (env.getProperty("jdbc.driverClassName") == null) {
            throw new IllegalArgumentException("jdbc.driverClassName must be set in properties");
        }
        if (env.getProperty("jdbc.url") == null) {
            throw new IllegalArgumentException("jdbc.url must be set in properties");
        }
        if (env.getProperty("jdbc.user") == null) {
            throw new IllegalArgumentException("jdbc.user must be set in properties");
        }
        if (env.getProperty("jdbc.pass") == null) {
            throw new IllegalArgumentException("jdbc.pass must be set in properties");
        }

        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    final Properties additionalProperties() {
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
        hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "false");
        hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        hibernateProperties.setProperty("hibernate.generateDdl", env.getProperty("hibernate.generateDdl"));

        return hibernateProperties;
    }
}