package com.mycompany.bankaccountde;

public abstract class BankAccount 
{
    //data
    private int accountNumber;
    private double balance;
    
    //setter method for accNo
    public void setAccountNumber(int accNo)
    {
        accNo = accountNumber;
    }
    
    //getter method for accNo
    public int setAccountNumber()
    {
        return accountNumber;
    }
    
    //setter method for balance
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    //getter method for balance
    public double getBalance()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
    
}
