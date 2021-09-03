package com.my_pvcpipes_app.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my_pvcpipes_app.model.services.customerservice.CustomerSvcHibernateImplTest;
import com.my_pvcpipes_app.model.services.factory.ServiceFactoryTest;

@RunWith(Suite.class)
@SuiteClasses({CustomerSvcHibernateImplTest.class, ServiceFactoryTest.class})
public class AllServicesTests {

}
