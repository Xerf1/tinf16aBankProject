package main;


public class CurrentAccount extends Account {
    public CurrentAccount(int pAccID, double pBalance, double pCreditLimit,int pPin, double pInterestRate, Customer pOwner){
        super(pAccID,pBalance,pCreditLimit,pPin,pInterestRate,pOwner);
    }
}
