package com.meritamerica.assignment1;


public class SavingsAccount
{

  double balance;

  private double interestRate;

  double futureValue;

  double presentValue;

  public SavingsAccount(double savingsAccountOpeningBalance)
  {

    balance = savingsAccountOpeningBalance;
    interestRate = 0.01;
    //System.out.println("Saving Account Balance: " + openingBalance);
  }

  public double getopeningBalance()
  {
    return balance;
  }

  public double getInterestRate()
  {

    System.out.println("Saving Account InterestRate is: " + interestRate);
    return interestRate;
  }

  public boolean withdraw(double amount)
  {
    if (amount <= balance)
    {
      balance = balance - amount;
      return true;
    }
    else
    {
      System.out.println("Transaction canceled due to insufficient balance");
      return false;
    }
  }

  public boolean deposit(double amount)
  {
    if (amount > 0.0)
    {
      this.balance += amount;
      System.out.println(this.balance);
      return true;
    }
    else
    {
      return false;
    }
  }

  public double getInterestRate(double interestRate)
  {
    return interestRate;
  }

  public void setInterestRate(double interestRate)
  {
    this.interestRate = interestRate;
  }

  public double futureValue(int years)
  {
    futureValue = Math.pow(1 + 0.01, (3.0)) * this.balance;
    System.out.println("Saving Account Balance in 3 years is:" + futureValue);
    return futureValue;
  }

  public double getBalance()
  {
    return balance;
  }

  public void setBalance(double balance)
  {
    this.balance = balance;
  }

}