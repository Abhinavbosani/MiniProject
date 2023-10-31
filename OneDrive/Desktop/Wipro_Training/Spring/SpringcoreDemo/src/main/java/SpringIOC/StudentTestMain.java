package SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTestMain {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringIOC/student-test.xml");
        Student s1=(Student)c.getBean("student1");
        Student s2=(Student)c.getBean("student2");
        System.out.println(s1);
        System.out.println(s2);
	}

}
