package hms.mchoice.rewards;

/**
 * Created by shashika on 7/30/15.
 */
public class BankAccount {
    private int balance;

    public BankAccount(int i) {

        balance=i;
    }

    public BankAccount() {
        balance = 0;
    }

    public int getBalance() {

        return balance;
    }

    public void deposit(int i) {

        balance=balance+i;
    }

    public void withdrawn(int i) {
        if(i<balance) {
            balance = balance - i;
        }else {
            System.out.println("You cannot withdraw that much");
        }
    }
}
