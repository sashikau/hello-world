package hms.mchoice.rewards;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BankAccountTest {

    @Test
    public void testGetBalance() throws Exception {

    }

    @Test
    public void testDeposit() throws Exception {
        BankAccount acc = new BankAccount();
        acc.deposit(50);
        assertTrue(acc.getBalance()==50);
    }

    @Test
    public void testWithdrawn() throws Exception {
        BankAccount acc = new BankAccount(50);
        acc.withdrawn(30);
        assertEquals(acc.getBalance(),20);
    }

    @Test
    public void testWithDrawnNeg() throws  Exception{
        BankAccount acc = new BankAccount(50);
        acc.withdrawn(80);
        assertEquals(acc.getBalance(),50);

    }


}