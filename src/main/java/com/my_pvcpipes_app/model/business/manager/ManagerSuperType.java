/**
 * 
 */
package com.my_pvcpipes_app.model.business.manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.my_pvcpipes_app.model.business.exception.PropertyFileNotFoundException;
import com.my_pvcpipes_app.model.domain.Composite;
import com.my_pvcpipes_app.model.services.manager.PropertyManager;

/**
 * @author Dcruz
 *
 */
public abstract class ManagerSuperType {
	static Logger logger = LogManager.getLogger();
	static {
		try {
			ManagerSuperType.loadProperties();
		} catch (PropertyFileNotFoundException propertyFileNotFoundException)
		{
			logger.info("Application Properties failed to be loaded - Application exiting...");
	    	System.exit(1);
		}
	}
	
	public abstract boolean performAction(String commandString, Composite composite);
	
    public static void loadProperties () throws PropertyFileNotFoundException
	{
		String propertyFileLocation = System.getProperty("prop_location");
		
        if (propertyFileLocation != null)
        { 
          // Now that we have the property file location, lets have the 
          // PropertyManager class load it up
          PropertyManager.loadProperties(propertyFileLocation);
        }
        else
        {
        	logger.info("Property file location not set. Passed in value is: " + propertyFileLocation + ".");
            throw new PropertyFileNotFoundException ("Property file location not set", null);         
        }
    	
    	
	} //end loadProperties

} // end of ManagerSuperType class
