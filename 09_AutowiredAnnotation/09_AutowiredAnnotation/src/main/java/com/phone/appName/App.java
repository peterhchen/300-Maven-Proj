package com.phone.appName;

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
        // Use BeanFactory or ApplicaitonContext for getBean()
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle obj = (Vehicle)context.getBean ("car");
    	obj.drive();
    	obj = (Vehicle)context.getBean ("bike");
    	obj.drive();
    	
    	//Tire t = new Tire();
    	Tire t = (Tire)context.getBean ("tire");
    	System.out.println(t);
    }
}