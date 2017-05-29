package main;


import java.time.LocalDateTime;

public class Transaction {

		private double amount;
		private LocalDateTime transactionTime;
		private String transType;
		private Account from;
		private Account target;

		public Transaction(Account from, Account target, double amount){
			this.amount = amount;
			this.transactionTime = LocalDateTime.now();
			this.target = target;
			this.from = from;
		}

		public String getInfo(){
			return ("Transacted "+amount+" at " + transactionTime + " from " + from.accID + " to " + target.accID);
		}


}
