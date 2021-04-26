package com.meritamerica.assignment1;


public class MeritAmericaBankApp
{

  public static void main(String[] args)
  {
    AccountHolder cust1 = new AccountHolder("Rohullah", "L", "Hussaini", "123456789", 100.0, 1000.0);
    System.out.println(cust1.getCheckingAccount().getBalance());

    cust1.getCheckingAccount().deposit(500.0);
    System.out.println(cust1.getCheckingAccount().getBalance());
    System.out.println(cust1.getCheckingAccount().getInterestRate());
    System.out.println(cust1.getSavingsAccount().getInterestRate());

    cust1.getSavingsAccount().withdraw(-800.0);
    System.out.println(cust1.getSavingsAccount().getBalance());

    AccountHolder cust2 = new AccountHolder("Laura", "Daphne", "Jackson", "12345678", 200.0, 500.0);
    System.out.println(cust2.getCheckingAccount().getBalance());

    cust2.getCheckingAccount().deposit(-500.0);

    System.out.println(cust2.getCheckingAccount().getBalance());
    System.out.println(cust2.getCheckingAccount().getInterestRate());

    cust2.getSavingsAccount().withdraw(-600.0);
    System.out.println(cust2.getSavingsAccount().getBalance());
    System.out.println(cust2.getSavingsAccount().getInterestRate());
  }
}