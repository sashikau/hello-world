package hms.mchoice.rewards;

/**
 * Created by shashika on 7/30/15.
 */
public class BankAccount {
    private int balance;

    public BankAccount(int amount) {

        balance=amount;
    }

    public BankAccount() {
        balance = 0;
    }

    public int getBalance() {

        return balance;
    }

//Method deleted

    public void withdrawn(int amount) {
        if(amount < balance) {
            balance = balance - amount;
        }else {
            System.out.println("You cannot withdraw that much" + amount + " " + balance); 
        }
	System.out.println("Method end!"); //Change by Hiran 
    }
}
