package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdConfig {
    public String prodBean(@Value("${EXAMPLE_TEST}") String exampleTest){
        if(! exampleTest.equals("default")){
            return "Prod Bean создан со значением EXAMPLE_TEST: " + exampleTest;
        }else {return null;}
    }
}
