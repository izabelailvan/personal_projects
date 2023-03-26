package isp.lab5.exercise1;

public class ATM {
    private String pinForTransactions;

    public ATM() {
    }
    public void setPinForTransactions(String pin){
        this.pinForTransactions=pin;
    }

    public String getPinForTransactions(){
        return pinForTransactions;
    }

    public void changePin(String oldPin, String newPin) {

    }

    public void withdraw(double amount) {

    }

    public void checkMoney() {

    }

    public boolean insertCard(Card card, String pin) {
        if (card.getPin() == pin) {
            this.pinForTransactions = pin;
            System.out.println("2 pins matched");
            return true;
        }
        System.out.println("Incorrect pin");
        return false;
    }

    public void removeCard() {

        this.pinForTransactions=null;
        System.out.println("Card removed");

    }
}
