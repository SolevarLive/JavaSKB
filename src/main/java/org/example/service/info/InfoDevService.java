package org.example.service.info;

import org.example.common.Info;

public class InfoDevService implements InfoServiceApi{

    @Override
    public Info getInfo(Info info) {
        return new Info(info);
    }
}
