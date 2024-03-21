package org.example.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("javalesson")
public class InfoProperties {
    String appname;
    String env;
    List<String> comments;
}
