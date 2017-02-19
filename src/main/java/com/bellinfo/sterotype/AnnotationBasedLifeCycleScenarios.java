package com.bellinfo.sterotype;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;
@Component
public class AnnotationBasedLifeCycleScenarios{
	
	@PostConstruct
	public void init(){
		System.out.println("This will called after creating an object without any request");
	}
	
	@PreDestroy
	public void destroy1(){
		System.out.println("This will be called when I shutdown");
		System.out.println("Logic to keep connection closing");
	}


	

}
