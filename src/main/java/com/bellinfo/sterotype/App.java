package com.bellinfo.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("sterotype-beans.xml");
    	
    	Plane p = context.getBean(Plane.class);
    	p.engine.displayEngineDetails();
    	System.out.println( p.pilotInfo.getQualification());
    	
    	SingletonTest st1 = context.getBean("s1", SingletonTest.class);
    	st1.display();
    	SingletonTest st2 = context.getBean("s2", SingletonTest.class);
    	st2.display();
    	st1.display();
    	
    	
    	
    	
    	
    }
}
