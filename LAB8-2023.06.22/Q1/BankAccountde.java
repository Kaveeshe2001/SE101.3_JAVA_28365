package com.mycompany.bankaccountde;

public class BankAccountde {

    public static void main(String[] args) 
    {
        SavingAccount s1 = new SavingAccount();
        s1.setBalance(20000000.00);
        System.out.println("Interest for Saving Account: "+s1.calculateInterest());
        CheckingAccount c1 = new CheckingAccount();
        c1.setBalance(1000000.00);
        System.out.println("Interest for Checking Account: "+c1.calculateInterest());
    }
}
