package org.example.service.info;

import org.example.common.Info;
import org.example.config.property.InfoProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

public class InfoService{

    @Autowired
    private InfoProperties infoProperties;

    public Info getInfo(Info info) {
        Info result = new Info(info);
        result.setComment(String.join(", ", infoProperties.getComments()));
        return result;
    }
}
