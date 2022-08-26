package com.example.obspringsecuritycsrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                //se va generar un token y se va enviar al cliente
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                //autorizacion de URLS
                .authorizeHttpRequests((authz) -> {
                    // Por defecto si no se especifica nada entonces la proteccion CSRF esta habilitada
                            try {
                                authz
                                        //con esto permite que la petición con /login se pueda ver sin la autenticación
                                        .antMatchers("/", "/hola").permitAll()
                                        //
                                        .anyRequest().authenticated()
                                        .and().formLogin()
                                        .and().httpBasic();
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                )
                .httpBasic(withDefaults());
        return  http.build();
    }

    /**
     *  Este metodo maneja los roles de las personas que quieran entrar a la api
     * @return
     */
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build());
        manager.createUser(User.withUsername("admin")
                .password(passwordEncoder().encode("password"))
                .roles("USER", "ADMIN")
                .build());
        return manager;
    }

    /**
     * Este metodo encrypta la contraseña
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
