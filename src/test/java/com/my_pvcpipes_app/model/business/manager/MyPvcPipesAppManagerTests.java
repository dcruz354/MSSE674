/**
 * 
 */
package com.my_pvcpipes_app.model.business.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.my_pvcpipes_app.model.domain.Composite;
import com.my_pvcpipes_app.model.domain.Customer;

/**
 * @author Dcruz
 *
 */
public class MyPvcPipesAppManagerTests {
	
	private MyPvcPipesAppManager myPvcPipesAppManager;
	private Composite composite = new Composite();
	private Customer customer;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myPvcPipesAppManager = MyPvcPipesAppManager.getInstance();
		customer = new Customer(13, "David", "Cruz", "cruz@test.com", "password");
		composite.setCustomer(customer);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#getCustomer(java.lang.String, com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testGetCustomer() {
		boolean action = myPvcPipesAppManager.performAction("GetCustomer", composite);
		assertTrue(action);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#deleteCustomer(java.lang.String, com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testDeleteCustomer() {
		boolean action = myPvcPipesAppManager.performAction("DeleteCustomer", composite);
		assertTrue(action);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#updateCustomer(java.lang.String, com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testUpdateCustomer() {
		boolean action = myPvcPipesAppManager.performAction("UpdateCustomer", composite);
		assertTrue(action);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#addCustomer(java.lang.String, com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testAddCustomer() {
		boolean action = myPvcPipesAppManager.performAction("AddCustomer", composite);
		assertTrue(action);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#getAllCustomers(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testGetAllCustomers() {
		boolean action = myPvcPipesAppManager.performAction("GetAllCustomers", composite);
		assertTrue(action);
	}
	
	/**
	 * Test method for {@link com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager#returnAllCustomersList(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testReturnAllCustomersList() {
		fail("Not yet implemented");
	}

}
