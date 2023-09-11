package com.example.demo.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableMethodSecurity
// public class SecurityConfig {
//     @Bean
// 	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// 		return http
//             .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//             .csrf(csrf -> csrf.disable())
//             .oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()))
//             .build();
// 	}
// }
