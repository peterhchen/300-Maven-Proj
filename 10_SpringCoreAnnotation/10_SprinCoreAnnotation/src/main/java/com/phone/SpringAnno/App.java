package com.phone.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	Apple a = new Apple ();
//    	a.config();
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Apple a = factory.getBean(Apple.class);
    	a.config();
    }
}
