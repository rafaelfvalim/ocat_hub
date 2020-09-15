package br.com.octa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class BeerService {

    private final MeterRegistry meterRegistry;
    private Counter lightOrderCounter;
    private Counter aleOrderCounter;

    private List<Orden> orders = new ArrayList<>();

    public BeerService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        initOrderCounters();
        Gauge.builder("beer.ordersInQueue", orders, Collection::size)
                .description("Number of unserved orders")
                .register(meterRegistry);
    }

    private void initOrderCounters() {
        lightOrderCounter = this.meterRegistry.counter("beer.orders", "type", "light"); // 1 - create a counter
        aleOrderCounter = Counter.builder("beer.orders")    // 2- create a counter using the fluent API
                .tag("type", "ale")
                .description("The number of orders ever placed for Ale beers")
                .register(meterRegistry);
    }

    public void orderBeer(Orden order) {
        orders.add(order);

        if ("light".equals(order.type)) {
            lightOrderCounter.increment(1.0);  // 3 - increment the counters
        } else if ("ale".equals(order.type)) {
            aleOrderCounter.increment();
        }
    }

    @Scheduled(fixedRate = 5000)
    @Timed(description = "Time spent serving orders", longTask = true)
    public void serveFirstOrder() throws InterruptedException {
        if (!orders.isEmpty()) {
            Orden order = orders.remove(0);
            Thread.sleep(1000L * order.amount);
        }
    }
}

class Orden {
    int amount;
    String type;

    public Orden(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }
}
