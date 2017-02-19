package com.bellinfo.sterotype;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProgramaticLifeCycleScenarios  implements InitializingBean, DisposableBean  {

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("after creating an object");
		
	}

	public void destroy() throws Exception {
		System.out.println("while unloading your object from JVM");
		
	}
}
