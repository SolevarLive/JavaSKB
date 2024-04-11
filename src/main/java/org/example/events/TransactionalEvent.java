package org.example.events;

import org.springframework.context.ApplicationEvent;

public class TransactionalEvent extends ApplicationEvent {
    public TransactionalEvent(Object source) {
        super(source);
    }
}
