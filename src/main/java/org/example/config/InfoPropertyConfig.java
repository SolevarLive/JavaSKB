package org.example.config;
import org.example.config.property.InfoProperties;
import org.example.service.info.InfoService;
import org.example.service.info.InfoServiceApi;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(InfoProperties.class)
@Profile("test")
public class InfoPropertyConfig {

    @Bean
    public InfoServiceApi infoServiceApi() {
        return new InfoService();
    }
}
