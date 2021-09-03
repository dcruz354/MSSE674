/**
 * 
 */
package com.my_pvcpipes_app.model.business.exception;

/**
 * @author Dcruz
 *
 */
public class PropertyFileNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8458223196583526892L;
	
	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}
} // end of PropertyFileNotFoundException class
