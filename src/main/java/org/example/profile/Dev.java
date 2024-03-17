package org.example.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("dev")
public class Dev {

    @Value("${my.list}")
    private List<String> myList;

    @Value("${app.name}")
    private String appName;

    @Value("${EXAMPLE_TEST:default}")
    private String exampleTest;
}
