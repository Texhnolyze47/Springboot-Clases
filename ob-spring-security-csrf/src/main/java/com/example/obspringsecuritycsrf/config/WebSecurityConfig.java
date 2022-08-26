package com.example.obspringsecuritycsrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        //con esto permite que la petición con /hola se pueda ver sin la autenticación
                        .antMatchers("/", "/login").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(withDefaults());

        return  http.build();
    }
}
