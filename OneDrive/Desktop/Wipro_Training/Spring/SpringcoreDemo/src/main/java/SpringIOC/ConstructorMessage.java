package SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMessage {
	private String message=null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "ConstructerMessage [message=" + message + "]";
	}


	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringIOC/message.xml");
        ConstructorMessage cm=(ConstructorMessage)c.getBean("message");
        System.out.println(cm);
	}
	

}
