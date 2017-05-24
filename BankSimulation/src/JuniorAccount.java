

public class JuniorAccount extends Account {

	/**
	 * @uml.property  name="guardian"
	 */
	private Customer guardian;

	/**
	 * Getter of the property <tt>guardian</tt>
	 * @return  Returns the guardian.
	 * @uml.property  name="guardian"
	 */
	public Customer getGuardian() {
		return guardian;
	}

	/**
	 * Setter of the property <tt>guardian</tt>
	 * @param guardian  The guardian to set.
	 * @uml.property  name="guardian"
	 */
	public void setGuardian(Customer guardian) {
		this.guardian = guardian;
	}

}
