package main;


public abstract class MortgageAccount {

	/**
	 * @uml.property  name="limit"
	 */
	protected double limit;

	/**
	 * Getter of the property <tt>limit</tt>
	 * @return  Returns the limit.
	 * @uml.property  name="limit"
	 */
	public double getLimit() {
		return limit;
	}

	/**
	 * Setter of the property <tt>limit</tt>
	 * @param limit  The limit to set.
	 * @uml.property  name="limit"
	 */
	public void setLimit(double limit) {
		this.limit = limit;
	}

	/**
	 * @uml.property  name="interestRate"
	 */
	protected double interestRate;

	/**
	 * Getter of the property <tt>interestRate</tt>
	 * @return  Returns the interestRate.
	 * @uml.property  name="interestRate"
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Setter of the property <tt>interestRate</tt>
	 * @param interestRate  The interestRate to set.
	 * @uml.property  name="interestRate"
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @uml.property  name="apllicationFee" readOnly="true"
	 */
	protected double apllicationFee;

	/**
	 * Getter of the property <tt>apllicationFee</tt>
	 * @return  Returns the apllicationFee.
	 * @uml.property  name="apllicationFee"
	 */
	public double getApllicationFee() {
		return apllicationFee;
	}

	/**
	 * @uml.property  name="repayPenalty"
	 */
	protected double repayPenalty;

	/**
	 * Getter of the property <tt>repayPenalty</tt>
	 * @return  Returns the repayPenalty.
	 * @uml.property  name="repayPenalty"
	 */
	public double getRepayPenalty() {
		return repayPenalty;
	}

	/**
	 * Setter of the property <tt>repayPenalty</tt>
	 * @param repayPenalty  The repayPenalty to set.
	 * @uml.property  name="repayPenalty"
	 */
	public void setRepayPenalty(double repayPenalty) {
		this.repayPenalty = repayPenalty;
	}

}
