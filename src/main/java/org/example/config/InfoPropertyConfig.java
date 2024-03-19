package org.example.config;
import lombok.extern.log4j.Log4j2;
import org.example.common.Data;
import org.example.config.property.InfoProperties;
import org.example.service.info.InfoDevService;
import org.example.service.info.InfoProdService;
import org.example.service.info.InfoService;
import org.example.service.info.InfoServiceApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Log4j2
@Configuration
@EnableConfigurationProperties(InfoProperties.class)
public class InfoPropertyConfig {

    @Bean
    @Profile("test")
    public Data data(){
        return new Data();
    }

    @Bean
    @ConditionalOnBean(Data.class)
    public InfoServiceApi infoServiceApi() {
        return new InfoService();
    }

    @Bean
    @Profile("dev")
    public InfoServiceApi infoServiceDevApi() {
        return new InfoDevService();
    }

    @Bean
    @ConditionalOnProperty(prefix = "javalesson", name = "env", havingValue = "default")
    public InfoServiceApi infoServiceProdApi() {
        return new InfoProdService();
    }

}
