/**
 * 
 */
package com.my_pvcpipes_app.model.services.factory;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.my_pvcpipes_app.model.business.exception.ServiceLoadException;
import com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl;
import com.my_pvcpipes_app.model.services.customerservice.ICustomerService;
import com.my_pvcpipes_app.model.services.manager.PropertyManager;

/**
 * @author Dcruz
 *
 */
public class ServiceFactoryTest {
	
	Logger logger = LogManager.getLogger();

	ServiceFactory serviceFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String propertyFileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(propertyFileLocation);
		serviceFactory = ServiceFactory.getInstance();
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.factory.ServiceFactory#getService(java.lang.String)}.
	 */
	@Test
	public void testGetCustomerService() {
		ICustomerService customerService;
		try {
			customerService = (ICustomerService)serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService instanceof CustomerSvcHibernateImpl);
			logger.info("testGetCustomerService PASSED");
		} catch (ServiceLoadException e) {
			logger.info("testGetCustomerService FAILED");
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

}
