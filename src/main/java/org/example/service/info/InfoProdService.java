package org.example.service.info;

import org.example.common.Info;
import org.example.config.property.InfoProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class InfoProdService implements InfoServiceApi{

    @Autowired
    private InfoProperties infoProperties;
    @Override
    public Info getInfo(Info info) {
        Info result = new Info(info);
        result.setComment(String.join(", ", infoProperties.getComments()));
        return result;
    }
}
