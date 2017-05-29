package main;


public class JuniorAccount extends Account {
	private Customer guardian;

	public JuniorAccount(int pAccID, double pBalance, double pCreditLimit,int pPin, double pInterestRate, Customer pOwner, Customer pGuardian){
		super(pAccID,pBalance,pCreditLimit,pPin,pInterestRate,pOwner);
		guardian=pGuardian;
	}



	public Customer getGuardian() {

		return guardian;
	}


	public void setGuardian(Customer guardian) {

		this.guardian = guardian;
	}

}
