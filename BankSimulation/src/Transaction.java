

public class Transaction {

		
		/**
		 */
		public Transaction(){
		}

		/**
		 * @uml.property  name="amount"
		 */
		private double amount;

		/**
		 * Getter of the property <tt>amount</tt>
		 * @return  Returns the amount.
		 * @uml.property  name="amount"
		 */
		public double getAmount() {
			return amount;
		}

		/**
		 * Setter of the property <tt>amount</tt>
		 * @param amount  The amount to set.
		 * @uml.property  name="amount"
		 */
		public void setAmount(double amount) {
			this.amount = amount;
		}

		/**
		 * @uml.property  name="transactionTime"
		 */
		private double transactionTime;

		/**
		 * Getter of the property <tt>transactionTime</tt>
		 * @return  Returns the transactionTime.
		 * @uml.property  name="transactionTime"
		 */
		public double getTransactionTime() {
			return transactionTime;
		}

		/**
		 * Setter of the property <tt>transactionTime</tt>
		 * @param transactionTime  The transactionTime to set.
		 * @uml.property  name="transactionTime"
		 */
		public void setTransactionTime(double transactionTime) {
			this.transactionTime = transactionTime;
		}

		/**
		 * @uml.property  name="transType"
		 */
		private String transType;

		/**
		 * Getter of the property <tt>transType</tt>
		 * @return  Returns the transType.
		 * @uml.property  name="transType"
		 */
		public String getTransType() {
			return transType;
		}

		/**
		 * Setter of the property <tt>transType</tt>
		 * @param transType  The transType to set.
		 * @uml.property  name="transType"
		 */
		public void setTransType(String transType) {
			this.transType = transType;
		}

}
