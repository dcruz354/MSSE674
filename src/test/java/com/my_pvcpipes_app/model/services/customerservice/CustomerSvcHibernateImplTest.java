/**
 * 
 */
package com.my_pvcpipes_app.model.services.customerservice;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.my_pvcpipes_app.model.business.exception.ServiceLoadException;
import com.my_pvcpipes_app.model.domain.Composite;
import com.my_pvcpipes_app.model.domain.Customer;
import com.my_pvcpipes_app.model.services.exception.CustomerException;
import com.my_pvcpipes_app.model.services.factory.ServiceFactory;
import com.my_pvcpipes_app.model.services.manager.PropertyManager;

/**
 * @author Dcruz
 *
 */
public class CustomerSvcHibernateImplTest {
	Logger logger = LogManager.getLogger();
	
	ServiceFactory serviceFactory;
	Composite composite = new Composite();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String propertyFileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(propertyFileLocation);
		serviceFactory = ServiceFactory.getInstance();
		
		Customer newCustomer = new Customer(14, "David1Update", "Test1Update", "test1Update@foo.com", "test1Update");

		composite.setCustomer(newCustomer);
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#getAllCustomers()}.
	 */
	@Ignore
	@Test
	public void testGetAllCustomers() {
		logger.info("CustomerSvcHibernateImplTest::testGetAllCustomers");
		ICustomerService customerService;
		try {
			customerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService.getAllCustomers());
		} catch(ServiceLoadException e) {
			logger.info("failed ServiceLoadException");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("failed CustomerException");
		} 
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#getCustomer(com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testGetCustomer() {
		logger.info("CustomerSvcHibernateImplTest::testGetCustomer");
		ICustomerService customerService;
		try {
			customerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService.getCustomer(composite));
		} catch(ServiceLoadException e) {
			logger.info("failed ServiceLoadException");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("failed CustomerException");
		} 
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#addCustomer(com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testAddCustomer() {
		  logger.info("CustomerSvcHibernateImplTest::testAddCustomer"); 
		  ICustomerService customerService; 
		  try { customerService = (ICustomerService)
		  serviceFactory.getService(ICustomerService.NAME);
		  assertTrue(customerService.addCustomer(composite)); }
		  catch(ServiceLoadException e) { 
			  logger.info("failed ServiceLoadException"); }
		  catch (CustomerException e) { 
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			  logger.info("failed CustomerException"); } 
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#updateCustomer(com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testUpdateCustomer() {
		logger.info("CustomerSvcHibernateImplTest :: testUpdateCustomer");
		ICustomerService customerService;
		try { customerService = (ICustomerService)
				serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService.updateCustomer(composite)); }
		catch(ServiceLoadException e) 
		{ 
			logger.info("failed ServiceLoadException"); 
		}
		catch (CustomerException e) 
		{ 
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			logger.info("failed CustomerException"); 
		}
	}

	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#deleteCustomer(com.my_pvcpipes_app.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testDeleteCustomer() {
		 logger.info("CustomerSvcHibernateImplTest :: testDeleteCustomer");
		 ICustomerService customerService; 
		 try { customerService = (ICustomerService)
		 serviceFactory.getService(ICustomerService.NAME);
		 assertTrue(customerService.deleteCustomer(composite)); }
		 catch(ServiceLoadException e) { logger.info("failed ServiceLoadException"); }
		 catch (CustomerException e) { // TODO Auto-generated catch block
		 e.printStackTrace(); logger.info("failed CustomerException"); } 
	}
	
	/**
	 * Test method for {@link com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImpl#returnAllCustomersList()}.
	 */
	@Ignore
	@Test
	public void testReturnAllCustomersList() {
		fail("Not yet implemented");
	}

}
