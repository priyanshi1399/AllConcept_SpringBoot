package com.priyanshi.FormbasedAuthentication;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /*
    @Bean

    //by {noop}
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User.withUsername("user")
                .password("{noop}123")
                .roles("ADMIN")
                .build();


        return new InMemoryUserDetailsManager(user1);

    }*/



        /*

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .permitAll()
                        .defaultSuccessUrl("/api/", true)
                )
                .logout(logout -> logout.permitAll());


        http.headers(headers -> headers.disable());
        http.csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"));

        return http.build();
    }*/

    /*@Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests)->requests.anyRequest().authenticated())  .formLogin(form -> form
                .permitAll()
                .defaultSuccessUrl("/api/", true)
        );
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }*/

    @Bean

    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth->auth.requestMatchers("/users")
                .hasRole("USER").anyRequest().authenticated()
        ).
                 formLogin(form -> form
                .failureHandler((request, response, exception) -> {
                    response.setContentType("text/plain");
                    response.getWriter().write("Login failed: " + exception.getMessage());
                })
                 ).
                sessionManagement(session->session.maximumSessions(1)
                        .maxSessionsPreventsLogin(true)).
      formLogin(Customizer.withDefaults());
        return http.build();
    }
}

