package org.example.service;

import org.example.events.CustomEvent;
import org.example.events.TransactionalEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishEvents() {

        CustomEvent event = new CustomEvent(this);
        publisher.publishEvent(event);
        System.out.println("Custom event published.");


        publishTransactionalEvent(true);
        publishTransactionalEvent(false);
    }

    @Transactional
    public void publishTransactionalEvent(boolean shouldCommit) {
        TransactionalEvent event = new TransactionalEvent(this);
        publisher.publishEvent(event);
        System.out.println("Transactional event published.");

        if (!shouldCommit) {
            throw new RuntimeException("Forcing transaction rollback");
        }
    }
}
