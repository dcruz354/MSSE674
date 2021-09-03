package com.my_pvcpipes_app.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my_pvcpipes_app.model.business.AllBusinessTests;
import com.my_pvcpipes_app.model.domain.AllDomainTests;
import com.my_pvcpipes_app.model.services.AllServicesTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllDomainTests.class, AllServicesTests.class})
public class AllApplicationTests {

}
