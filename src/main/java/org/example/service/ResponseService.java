package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.message.Message;
import org.example.dto.Response;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Log4j2
@Service
public class ResponseService {


    @RabbitListener(queues = "homework.rs")
    public void receiveMessage(Response response) {
       log.info(response);
    }
}