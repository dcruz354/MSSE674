/**
 * 
 */
package com.my_pvcpipes_app.model.domain;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dcruz
 *
 */
public class CustomerTest {
	Logger logger = LogManager.getLogger();
	
	private Customer customer1, customer2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		customer1 = new Customer(1, "David", "Test", "test@test.com", "1234");
		customer2 = new Customer(1, "David", "Test", "test@test.com", "1234");
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.domain.Customer#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsCustomer() {
		logger.info("starting testEqualsCustomer()");
		assertTrue ("customer1 equals customer2", customer1.equals(customer2));
		logger.info("testEqualsCustomer PASSED");
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.domain.Customer#validate()}.
	 */
	@Test
	public void testValidate() {
		logger.info("starting testValidate()");
		assertTrue ("customer1 validates", customer1.validate());
		logger.info("testValidate PASSED");
	}

}
