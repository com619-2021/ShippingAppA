package uk.ac.solent.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import uk.ac.solent.security.JwtAuthEntryPoint;
import uk.ac.solent.security.JwtAuthFilter;

@Configuration
@EnableWebSecurity
public class SpringBootWebSecurityConfiguration{

    @Configuration
    @Order(1)
    public static class RestApiSecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private JwtAuthEntryPoint noAuthHandler;

        @Bean
        public JwtAuthFilter jwtAuthenticationFilter() {
            return new JwtAuthFilter();
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }

        @Bean(BeanIds.AUTHENTICATION_MANAGER)
        @Override
        public AuthenticationManager authenticationManagerBean() throws Exception{
            return super.authenticationManager();
        }

        @Override
        protected void configure(HttpSecurity security) throws Exception {
            security
                    .cors()
                    .and()
                    .csrf()
                    .disable()
                    .exceptionHandling()
                    .authenticationEntryPoint(noAuthHandler)
                    .and()
                    .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .authorizeRequests()
                    .antMatchers("/auth/**").permitAll()
                    .antMatchers("/rest/openapi.json").permitAll()
                    .antMatchers("/rest/**").permitAll()
                    .anyRequest()
                    .authenticated();
            security.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        }
    }

    @Configuration
    @Order(2)
    public static class LoginFormSecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/",
                            "/home",
                            "/contact",
                            "/about",
                            "/index.html",
                            "/resources/**",
                            "/images/**",
                            "/swagger-ui/**",
                            "/registration",
                            "/rest/openapi.json"
                    ).permitAll()
                    .antMatchers("/mvc/**"
                    ).hasRole("USER") // ROLE_USER
                    .antMatchers("/users").hasRole("GLOBAL_ADMIN") // ROLE_GLOBAL_ADMIN
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/login")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    .defaultSuccessUrl("/home", true)
                    .permitAll()
                    .and()
                    .logout()
                    .permitAll()
                    .logoutSuccessUrl("/login?logout")
                    .and().csrf().ignoringAntMatchers("/rest/**"); // prevents csrf checking on rest api
        }

    }
}