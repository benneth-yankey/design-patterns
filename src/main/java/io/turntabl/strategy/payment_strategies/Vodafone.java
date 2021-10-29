package io.turntabl.strategy.payment_strategies;

public class Vodafone implements PaymentStrategy {

    @Override
    public void pay() {
        logger.info("Paying with vodafone service");
    }
    
}
