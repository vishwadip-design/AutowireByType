package com.byType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	

	ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("book.xml");
	Book b3=(Book)appcon.getBean("book");
	System.out.println(b3);
}	
}
