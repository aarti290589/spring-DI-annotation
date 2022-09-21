package com.spring.dependency_injection.di_by_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import com.spring.dependency_injection.di_by_xml.service.SmartKitchenServiceInterface;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        SmartKitchenServiceInterface sc = (SmartKitchenServiceInterface) ac.getBean("smartStoveService");
        System.out.println(sc.timer());
        sc.turnOn();
        
    }
}
