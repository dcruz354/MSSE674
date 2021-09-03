/**
 * 
 */
package com.my_pvcpipes_app.model.services.exception;

/**
 * @author Dcruz
 *
 */
public class CustomerException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7043970428342332265L;

	public CustomerException(final String inMessage)
	{
		super(inMessage);
	}
	
	public CustomerException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

} // end of CustomerException class
