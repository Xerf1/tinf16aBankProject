package main;


public abstract class Account {

	/**
	 * @uml.property  name="accID"
	 */
	protected int accID;

	/**
	 * Getter of the property <tt>accID</tt>
	 * @return  Returns the accID.
	 * @uml.property  name="accID"
	 */
	public int getAccID() {
		return accID;
	}

	/**
	 * Setter of the property <tt>accID</tt>
	 * @param accID  The accID to set.
	 * @uml.property  name="accID"
	 */
	public void setAccID(int accID) {
		this.accID = accID;
	}

	/**
	 * @uml.property  name="balance"
	 */
	protected double balance;

	/**
	 * Getter of the property <tt>balance</tt>
	 * @return  Returns the balance.
	 * @uml.property  name="balance"
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * Setter of the property <tt>balance</tt>
	 * @param balance  The balance to set.
	 * @uml.property  name="balance"
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @uml.property  name="creditLimit"
	 */
	protected double creditLimit;

	/**
	 * Getter of the property <tt>creditLimit</tt>
	 * @return  Returns the creditLimit.
	 * @uml.property  name="creditLimit"
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Setter of the property <tt>creditLimit</tt>
	 * @param creditLimit  The creditLimit to set.
	 * @uml.property  name="creditLimit"
	 */
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @uml.property  name="owner"
	 */
	protected Customer owner;

	/**
	 * Getter of the property <tt>owner</tt>
	 * @return  Returns the owner.
	 * @uml.property  name="owner"
	 */
	public Customer getOwner() {
		return owner;
	}

	/**
	 * Setter of the property <tt>owner</tt>
	 * @param owner  The owner to set.
	 * @uml.property  name="owner"
	 */
	public void setOwner(Customer owner) {
		this.owner = owner;
	}

		
		/**
		 */
		public Account(Customer owner){
			this.owner=owner;
		}

		/**
		 * Getter of the property <tt>pin</tt>
		 * @return  Returns the pin1.
		 * @uml.property  name="pin"
		 */
		public int getPin() {
			return pin1;
		}

		/**
		 * @uml.property  name="pin"
		 */
		protected int pin1;

		/**
		 * Setter of the property <tt>pin</tt>
		 * @param pin  The pin1 to set.
		 * @uml.property  name="pin"
		 */
		public void setPin(int pin) {
			pin1 = pin;
		}

			
			/**
			 */
			public void deposed(){
			}

				
				/**
				 */
				public void widthDrawal(){
				}

					
					/**
					 */
					public void query(){
					}

}
