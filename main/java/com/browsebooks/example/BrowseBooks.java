package com.browsebooks.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BrowseBooks {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Inventory inventory = (Inventory) context.getBean("inventory");
		Inventory inventory1 = (Inventory) context.getBean("inventory1");

		System.out.println(inventory.getBookName());
		System.out.println(inventory.getGenre());

		System.out.println(inventory1.getBookName());
		System.out.println(inventory1.getGenre());
	}
}
