package uk.ac.solent.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import uk.ac.solent.dao.PersistenceJPAConfig;

@Configuration

@ComponentScan(basePackages = {"uk.ac.solent.service.booking",
        "uk.ac.solent.service.route",
        "uk.ac.solent.service.config",
        "uk.ac.solent.service.ship",
        "uk.ac.solent.service.user"
})
@Import({PersistenceJPAConfig.class})
public class ServiceConfiguration {

}