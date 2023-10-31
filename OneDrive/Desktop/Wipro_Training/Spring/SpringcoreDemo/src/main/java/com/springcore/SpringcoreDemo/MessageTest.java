package com.springcore.SpringcoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		DefaultMessage d=new DefaultMessage();
//		System.out.println(d.getMessage());
		System.out.println( "Started" );
        ApplicationContext c=new ClassPathXmlApplicationContext("com/springcore/SpringcoreDemo/message.xml");
        DefaultMessage m=c.getBean(DefaultMessage.class);
        System.out.println(m.getMessage());

	}

}
