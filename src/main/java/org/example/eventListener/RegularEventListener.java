package org.example.eventListener;


import org.example.events.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RegularEventListener {

    @EventListener
    public void handleCustomEvent(CustomEvent event) {
        System.out.println("Handling regular event.");
    }
}