package com.meritamerica.assignment1;


// This application demonstrates the checking account class.

public class CheckingAccount
{
  private double balance;

  private double interestRate;

  private double futureValue;

  public CheckingAccount(double checkingAccountOpeningBalance)
  {
    balance = checkingAccountOpeningBalance;
    interestRate = 0.0001;

  }

  public double getopeningBalance()
  {
    return balance;
  }

  public double getopenigBalance()
  {
    return balance;
  }

  public double getInterestRate()
  {
    return interestRate;
  }

  public boolean withdraw(double amount)
  {
    if (amount <= balance)
    {
      balance = balance - amount;
      return true;
    }
    return false;
  }

  public boolean deposit(double amount)
  {
    if (amount > 0)
    {
      balance = balance + amount;
      return true;
    }
    else
    {
      return false;
    }
  }

  public double getinterestRate()
  {
    return interestRate;
  }

  public void setInterestRate(double interestRate)
  {
    this.interestRate = interestRate;
  }

  public double getBalance()
  {
    return balance;
  }

  public void setBalance(double balance)
  {
    this.balance = balance;
  }

  public double futureValue(int years)
  {

    futureValue = 100.0 * Math.pow((1 + 0.0001), (3.0));
    System.out.println("Checking Account Balance in 3 years is:" + futureValue);
    return futureValue;
  }
}
