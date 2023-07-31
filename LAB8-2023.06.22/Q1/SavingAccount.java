package com.mycompany.bankaccountde;

public class SavingAccount extends BankAccount
{
    private static final double interestRate=0.12;
    
    public double calculateInterest()
    {
        return getBalance()*interestRate;
    }
}
