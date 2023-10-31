package com.springcore.SpringcoreDemo;

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
        System.out.println( "Started" );
        ApplicationContext c=new ClassPathXmlApplicationContext("com/springcore/SpringcoreDemo/movieconfig.xml");
        MovieBean m1=c.getBean(MovieBean.class);
        System.out.println(m1);
    }
}
