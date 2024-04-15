package org.example.service;

import org.example.dto.Request;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PublishingService {

    private final RabbitTemplate rabbitTemplate;
    private static final String EXCHANGE = "homework";
    private static final String ROUTING_KEY = "homework.in";

    @Autowired
    public PublishingService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishMessage(Request request) {
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, request);
    }
}