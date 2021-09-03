/**
 * 
 */
package com.my_pvcpipes_app.model.services.customerservice;

import java.util.List;

import com.my_pvcpipes_app.model.domain.Composite;
import com.my_pvcpipes_app.model.domain.Customer;
import com.my_pvcpipes_app.model.services.IService;
import com.my_pvcpipes_app.model.services.exception.CustomerException;

/**
 * @author Dcruz
 *
 */
public interface ICustomerService extends IService{
	public final String NAME = "ICustomerService";
	
	public boolean getAllCustomers() throws CustomerException;
	public boolean getCustomer(Composite composite) throws CustomerException;
	public boolean addCustomer(Composite composite) throws CustomerException;
	public boolean updateCustomer(Composite composite) throws CustomerException;
	public boolean deleteCustomer(Composite composite) throws CustomerException;
	public List<Customer> returnAllCustomersList() throws CustomerException;
}
