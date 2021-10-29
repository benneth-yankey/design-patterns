package io.turntabl.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import io.turntabl.strategy.payment_strategies.Vodafone;

public class WestHillsMallTest {

    @Test
    void testThatInstanceCanBeCreated() {
        // given
        WestHillsMall mall = new WestHillsMall();
        WestHillsMall spyMall = spy(mall);
        // when
        doReturn("12345").when(spyMall).getID();
        // then
        assertEquals("12345", spyMall.getID());
    }

    @Test
    void testThatPaymentService_GetsCalled1Time() {
        // given
        Vodafone vodafone = mock(Vodafone.class);
        WestHillsMall westhills = new WestHillsMall();
        // when
        westhills.setPaymentService(vodafone); 
        westhills.pay();
        // then
        verify(vodafone, times(1)).pay();
    }
}
