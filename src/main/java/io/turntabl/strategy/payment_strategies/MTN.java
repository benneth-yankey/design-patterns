package io.turntabl.strategy.payment_strategies;

public class MTN implements PaymentStrategy {

    @Override
    public void pay() {
        logger.info(() -> "Paying with mtn service");
    }

}