/**
 * 
 */
package com.my_pvcpipes_app.model.services.customerservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.my_pvcpipes_app.model.domain.Composite;
import com.my_pvcpipes_app.model.domain.Customer;
import com.my_pvcpipes_app.model.services.exception.CustomerException;
import com.my_pvcpipes_app.model.services.sessionfactory.BaseSvcHibernateImpl;

/**
 * @author Dcruz
 *
 */
public class CustomerSvcHibernateImpl extends BaseSvcHibernateImpl implements ICustomerService{
	Logger logger = LogManager.getLogger();

	@Override
	public List<Customer> returnAllCustomersList() throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : returnAllCustomersList");
		
		List<Customer> customers = new ArrayList<>();
		Session session = null;
		Transaction tranx = null;
		try{
			session = getSession();
			tranx = session.beginTransaction();
			Query query = session.createQuery("from Customer");
			
			List resultList = query.list();
			java.util.Iterator iterator = resultList.iterator();
			while(iterator.hasNext()) {
				Customer customer = (Customer)iterator.next();
				customers.add(customer);
			}
			
			if(customers != null) {
				for(Customer c : customers) {
					logger.info(c.toString());
				}
			} else
				logger.info("No customers to print");
			
			return customers;
		} catch (Exception e) {
			logger.info(e);
			return null;
		} finally {
			tranx.commit();
			session.close();
		}
	}
	
	@Override
	public boolean getAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : getAllCustomers");
		
		List<Customer> customers = new ArrayList<>();
		Session session = null;
		Transaction tranx = null;
		try{
			session = getSession();
			tranx = session.beginTransaction();
			Query query = session.createQuery("from Customer");
			
			List resultList = query.list();
			java.util.Iterator iterator = resultList.iterator();
			while(iterator.hasNext()) {
				Customer customer = (Customer)iterator.next();
				customers.add(customer);
			}
			
			if(customers != null) {
				for(Customer c : customers) {
					logger.info(c.toString());
				}
			} else
				logger.info("No customers to print");
			
			return true;
		} catch (Exception e) {
			logger.info(e);
			return false;
		} finally {
			tranx.commit();
			session.close();
		}
	}

	@Override
	public boolean getCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : getCustomer");
		boolean isSuccess = false;
		Session session = null;
		Transaction tranx = null;
		try {
			session = getSession();
			tranx = session.beginTransaction();
			Customer customer = (Customer) session.get(Customer.class, new Integer(composite.getCustomer().getId()));
			
			if(customer != null)
			{
				logger.info(customer.toString());
				isSuccess = true;
			} else {
				logger.info("Customer is null.");
			}
			isSuccess = true;
		} catch(Exception e) {
			logger.info(e);
			isSuccess = false;
		} finally {
			tranx.commit();
			session.close();
		}
		
		return isSuccess;

	}

	@Override
	public boolean addCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : addCustomer");
		boolean isSuccess = false;
		Session session = null;
		Transaction tranx = null;
		try {
			session = getSession();
			tranx = session.beginTransaction();
			Integer id = (Integer) session.save(composite.getCustomer());
			composite.getCustomer().setId(id);
			isSuccess = true;
			logger.info("Added Customer to the database");
		} catch (Exception e) {
			logger.info(e);
			logger.info("Failed to add customer to the database");
			isSuccess = false;
		} finally {
			tranx.commit();
			session.close();
		}
		
		return isSuccess;

	}

	@Override
	public boolean updateCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : updateCustomer");
		boolean isSuccess = false;
		Session session = null;
		Transaction tranx = null;
		try {
			session = getSession();
			tranx = session.beginTransaction();
			session.update(composite.getCustomer());

			isSuccess = true;
		} catch (Exception e) {
			logger.info(e);
			e.printStackTrace();
			logger.info("Failed to update Customer");
			isSuccess = false;
		}
		finally {
			tranx.commit();
			session.close();
		}
		return isSuccess;

	}

	@Override
	public boolean deleteCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerSvcHibernateImpl : deleteCustomer");
		boolean isSuccess = false;
		Session session = null;
		Transaction tranx = null;
		try {
			session = getSession();
			tranx = session.beginTransaction();
			session.delete(composite.getCustomer());

			isSuccess = true;
		} catch (Exception e){
			logger.info(e);
			e.printStackTrace();
			logger.info("Failed to delete customer from the database");
			isSuccess = false;
		} finally {
			tranx.commit();
			session.close();
		}
		
		return isSuccess;

	}
} // end of  CustomerSvcHibernateImpl class
