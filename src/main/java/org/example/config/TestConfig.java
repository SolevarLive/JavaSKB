package org.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public String testBean(){
        return "Test Bean";
    }

    @Bean
    public String secondBean(@Autowired String testBean){
        return "Второй компонент, созданный с помощью" + testBean;
    }
}
