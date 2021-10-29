package io.turntabl.strategy;

import java.util.UUID;
import java.util.logging.Logger;

import io.turntabl.strategy.payment_strategies.PaymentStrategy;

public class WestHillsMall {
    Logger logger = Logger.getLogger(WestHillsMall.class.getName());
    private PaymentStrategy paymentService;
    private String id = UUID.randomUUID().toString();

    public void setPaymentService(PaymentStrategy paymentService) {
        this.paymentService = paymentService;
    }

    public String getID() {
        return id;
    }

    /** pay calls the appropriate payment service */
    public void pay() {
        paymentService.pay();
    }
}
