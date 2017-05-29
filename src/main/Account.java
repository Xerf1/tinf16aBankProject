package main;


public abstract class Account {
	protected int accID;
	protected double balance;
	protected double creditLimit;
	protected int pin;
	protected double interestRate;
	protected Customer owner;

	public Account(int pAccID, double pBalance, double pCreditLimit,int pPin, double pInterestRate, Customer pOwner){
		accID=pAccID;
		balance=pBalance;
		pCreditLimit=pCreditLimit;
		pin=pPin;
		interestRate=pInterestRate;
		owner=pOwner;
	}

	public void deposit(double value){
		balance=balance+value;
	}

	public boolean checkPin(int pPin) {
		if (pin==pPin)
		{
			return true;
		}
		return false;
	}

	public void withDr(double value){
		if(balance-value >0) {
			balance = balance - value;
		}
	}

	public int getAccID(){
		return accID;
	}

	public double getCreditLimit(){
		return creditLimit;
	}

	public Customer getOwner(){

		return owner;
	}

	public double getBalance(){
		return balance;
	}
	public void setBalance(double pBalance){
		balance=pBalance;
	}

	public void setInterestRate(double pRate) {
		interestRate=pRate;
	}

	public void setPin( int pPin){
		pin=pPin;
	}

}
