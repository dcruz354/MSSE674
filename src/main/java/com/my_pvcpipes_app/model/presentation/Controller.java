/**
 * 
 */
package com.my_pvcpipes_app.model.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.my_pvcpipes_app.model.business.manager.MyPvcPipesAppManager;

/**
 * @author Dcruz
 *
 */
public class Controller {
	
	static Logger logger = LogManager.getLogger();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instantiate the manager
		MyPvcPipesAppManager manager = MyPvcPipesAppManager.getInstance();
		
		//test get all customers
		logger.info("retrieve all customers");
		boolean allRetrieved;
		allRetrieved = manager.performAction("GetAllCustomers", null);
		logger.info(allRetrieved);

	}

}
