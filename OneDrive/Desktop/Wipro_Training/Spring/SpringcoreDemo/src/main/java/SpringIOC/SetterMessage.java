package SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMessage {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SetterMessage [message=" + message + "]";
	}
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringIOC/setter-message.xml");
       SetterMessage sm =(SetterMessage)c.getBean("message");
        System.out.println(sm);
	}

}
