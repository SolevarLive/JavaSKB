package org.example.config;
import org.example.common.Info;
import org.example.config.property.InfoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(InfoProperties.class)
@Profile("dev")
public class InfoPropertyDevConfig {


    @Bean
    public Info info() {
        return new Info();
    }
}
