/**
 * 
 */
package com.my_pvcpipes_app.model.services.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Dcruz
 *
 */
public class BaseSvcHibernateImpl {
	private static final Configuration config = new Configuration();
	private static SessionFactory sessionFactory = null;
	private static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = config.configure().buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
	protected static Session getSession() {
		SessionFactory factory = getSessionFactory();
		return (factory != null) ? factory.openSession() : null;
	}

}
