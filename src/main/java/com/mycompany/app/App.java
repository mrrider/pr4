package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kozak.Car;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
	    
		Car merc = (Car)context.getBean("w201");
		merc.drive();
		
		Car bmw = (Car)context.getBean("e39");
		bmw.drive();
		
		Car amgMercedes = (Car)context.getBean("amgMercedes");
		amgMercedes.drive();
		
		Car alpinaBmw = (Car)context.getBean("AlpinaBmw");
		alpinaBmw.drive();
		
		Car audi = (Car)context.getBean("audi");
		audi.drive();
		
		Car tuningAudi = (Car)context.getBean("tuningAudi");
		tuningAudi.drive();
	}
}
