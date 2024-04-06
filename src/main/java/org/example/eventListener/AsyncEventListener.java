package org.example.eventListener;

import org.example.events.CustomEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AsyncEventListener {

    @Async
    @EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Handling async event.");
    }
}