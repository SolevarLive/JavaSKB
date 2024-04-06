package org.example.eventListener;

import org.example.events.TransactionalEvent;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;

@Component
public class MyTransactionalEventListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleTransactionalEvent(TransactionalEvent event) {
        System.out.println("Handling transactional event after commit.");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void handleFailedTransactionalEvent(TransactionalEvent event) {
        System.out.println("Handling transactional event after rollback.");
    }
}
