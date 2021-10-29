package io.turntabl.strategy.payment_strategies;

public class AirtelTigo implements PaymentStrategy {

    @Override
    public void pay() {
        logger.info("Paying with airteltigo service");
    }

}
