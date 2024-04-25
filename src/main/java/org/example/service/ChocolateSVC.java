package org.example.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.example.dto.Chocolate;
import org.springframework.stereotype.Service;

@Service
public class ChocolateSVC {

    private final MeterRegistry meterRegistry;

    public ChocolateSVC(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    public void incrementChocolateSales(String type) {
        Counter counter = Counter.builder("sales.chocolate")
                .tag("type", type)
                .register(meterRegistry);
        counter.increment();
    }

    public Chocolate getChocolateSales(String type) {
        Double sales = meterRegistry.get("sales.chocolate").tag("type", type).counter().count();
        return new Chocolate(type, sales.intValue());
    }
}
