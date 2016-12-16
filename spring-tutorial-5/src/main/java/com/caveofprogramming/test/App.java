package com.caveofprogramming.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 
//		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/test/beans/beans.xml");
		
//		Person person = new Person();
		Person person1 = (Person) context.getBean("person");
		person1.speak();
		
		System.out.println(person1);
		
		Address address = (Address) context.getBean("address1");
		System.out.println(address);
		
		Person person2 = (Person) context.getBean("person");
		person1.setTaxId(666);
		System.out.println("person2: " + person2);
		System.out.println("person1: " + person1);
		
//		((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();

	}

}
