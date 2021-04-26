package com.meritamerica.assignment1;


public class AccountHolder
{
  private String firstName;

  private String middleName;

  private String lastName;

  private String SSN;

  public CheckingAccount checkingAccount;

  public SavingsAccount savingsAccount;

  public double interestRate1;

  public double interestRate2;

  public AccountHolder(String firstName, String middleName, String lastName, String SSN, double checkingAccount, double savingsAccount)
  {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.SSN = SSN;
    this.checkingAccount = new CheckingAccount(checkingAccount);
    this.savingsAccount = new SavingsAccount(savingsAccount);

  }

  public String getfirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getmiddleName()
  {
    return middleName;
  }

  public void setmiddleName(String middleName)
  {
    this.middleName = middleName;
  }

  public String getlastName()
  {
    return lastName;
  }

  public void setlastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getSSN()
  {
    return SSN;
  }

  public void setSSN(String SSN)
  {
    this.SSN = SSN;
  }

  public CheckingAccount getCheckingAccount()
  {
    return checkingAccount;
  }

  public void setcheckingAccount(CheckingAccount checkingAccount)
  {
    this.checkingAccount = checkingAccount;
  }

  public SavingsAccount getSavingsAccount()
  {
    return savingsAccount;
  }

  public void setSavingsAccount(SavingsAccount savingsAccount)
  {
    this.savingsAccount = savingsAccount;
  }

  @Override
  public String toString()
  {
    {
      String output = "Name" + "this.firstName" + "this.middleName" + "this.lastName" + "this.SSN" + "this.checkingAccount" + "this.savingAccount";
      return output;
    }

  }

}