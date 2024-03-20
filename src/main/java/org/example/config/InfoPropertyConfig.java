package org.example.config;
import lombok.extern.log4j.Log4j2;
import org.example.common.Data;
import org.example.config.property.InfoProperties;
import org.example.service.info.InfoService;
import org.example.service.info.InfoServiceApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Log4j2
@Configuration
@EnableConfigurationProperties(InfoProperties.class)
public class InfoPropertyConfig {

    //создал бин если только "test"
    @Bean
    @Profile("test")
    public Data data(){
        return new Data();
    }

    //создается бин  если создался бин под "test"
    @Bean
    @ConditionalOnBean(Data.class)
    public InfoServiceApi infoServiceApi() {
        return new InfoService();
    }

    //создается бин если значнеие не 'default'
    @Bean
    @ConditionalOnExpression("'${javalesson.env}' != 'default'")
    public InfoServiceApi infoServiceProdApi() {
        return new InfoService();
    }


}
