package main;


public abstract class MortgageAccount {

	public MortgageAccount(double lim, double interestRate_,double appliFee, double repayPenalty_){
		limit= lim;
		interestRate = interestRate_;
		applicationFee = appliFee;
		repayPenalty = repayPenalty_;
	}
	protected double limit;


	public double getLimit() {
		return limit;
	}


	protected double interestRate;


	public double getInterestRate() {
		return interestRate;
	}


	protected double applicationFee;


	public double getApllicationFee() {
		return applicationFee;
	}


	protected double repayPenalty;


	public double getRepayPenalty() {
		return repayPenalty;
	}



}
