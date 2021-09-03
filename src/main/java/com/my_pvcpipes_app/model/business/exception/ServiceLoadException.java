/**
 * 
 */
package com.my_pvcpipes_app.model.business.exception;

/**
 * @author Dcruz
 *
 */
public class ServiceLoadException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7730536152672170311L;

	public ServiceLoadException(final String inMessage, final Throwable inNestedException)
	{
		super(inMessage, inNestedException);
	}

} // end of ServiceLoadException class
