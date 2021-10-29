package io.turntabl.strategy.payment_strategies;

import java.util.logging.Logger;

public interface PaymentStrategy {
    Logger logger = Logger.getLogger(PaymentStrategy.class.getName());
    void pay();
}