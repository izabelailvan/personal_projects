package isp.lab5.exercise1;


import java.util.ArrayList;


public class Exercise1 {

    public static void main(String[] args) {

        ATM atm=new ATM();
        atm.setPinForTransactions("1234");
        Card card = new Card("21", "1235");
        atm.insertCard(card, atm.getPinForTransactions());

        atm.removeCard();

    }
}
