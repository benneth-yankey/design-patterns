package io.turntabl.strategy;

import java.util.UUID;
import java.util.logging.Logger;

import io.turntabl.strategy.payment_strategies.PaymentStrategy;

public class WestHillsMall {
    Logger logger = Logger.getLogger(WestHillsMall.class.getName());
    private final PaymentStrategy paymentService;
    private String id = UUID.randomUUID().toString();

    public WestHillsMall(PaymentStrategy paymentService) {
        this.paymentService = paymentService;
    }

    public String getID() {
        return id;
    }

    public void shop() {
        logger.info("Shopping couple of items");
        logger.info("Bought TV, Refrigerator");
    }

    /** pay calls the appropriate payment service */
    public void pay() {
        paymentService.pay();
    }
}
