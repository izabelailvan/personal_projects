package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void testInsertCard(){
        ATM atm=new ATM();
        atm.setPinForTransactions("1234");
        Card card = new Card("21", "1234");
        assertEquals("Should compare 2 pins", true, atm.insertCard(card, atm.getPinForTransactions()));

        ATM atm1=new ATM();
        atm.setPinForTransactions("1234");
        Card card1 = new Card("21", "1235");
        assertEquals("Should compare 2 pins", false, atm1.insertCard(card1, atm1.getPinForTransactions()));
    }
}
