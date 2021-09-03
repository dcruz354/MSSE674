/**
 * 
 */
package com.my_pvcpipes_app.model.services.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.my_pvcpipes_app.model.business.exception.ServiceLoadException;
import com.my_pvcpipes_app.model.services.IService;
import com.my_pvcpipes_app.model.services.manager.PropertyManager;

/**
 * @author Dcruz
 *
 */
public class ServiceFactory {
	Logger logger = LogManager.getLogger();
	private ServiceFactory() {}
	
	private static ServiceFactory serviceFactoryInstance;
	
	public static ServiceFactory getInstance() {
		if(serviceFactoryInstance == null)
			serviceFactoryInstance = new ServiceFactory();
		return serviceFactoryInstance;
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return
	 * @throws ServiceLoadException
	 */
	@SuppressWarnings("deprecation")
	public IService getService(String serviceName) throws ServiceLoadException {
		try {
			Class<?> c = Class.forName(getImplName(serviceName));
			return (IService) c.newInstance();
		} catch (Exception excp) {
			serviceName = serviceName + " not loaded";
			throw new ServiceLoadException(serviceName, excp);
		}
	}
	
	/**
	 * 
	 * @param serviceName
	 * @return
	 * @throws Exception
	 */
	private String getImplName(String serviceName) //throws Exception
	{

		return PropertyManager.getPropertyValue(serviceName);
	}

} // end class ServiceFactory
