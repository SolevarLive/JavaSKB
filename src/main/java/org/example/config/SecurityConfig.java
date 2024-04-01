package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(jsr250Enabled = true)
 public class SecurityConfig {

//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            return http.csrf(AbstractHttpConfigurer::disable)
//                    .authorizeHttpRequests(name -> name.requestMatchers("/public/**").permitAll()
//                            .requestMatchers("/admin/**").hasRole("ADMIN")
//                            .requestMatchers("/support/**").hasRole("SUPPORT"))
//                    .httpBasic(Customizer.withDefaults()).build();
//        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

        @Bean
        public UserDetailsService userDetailsService() {
            UserDetails user = User.builder()
                    .username("admin")
                    .password(passwordEncoder().encode("admin"))
                    .roles("ADMIN")
                    .build();

            UserDetails user2 = User.builder()
                    .username("support")
                    .password(passwordEncoder().encode("support"))
                    .roles("SUPPORT")
                    .build();

            return new InMemoryUserDetailsManager(user, user2);
    }
}
