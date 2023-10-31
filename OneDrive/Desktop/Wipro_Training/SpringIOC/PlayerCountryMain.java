package SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerCountryMain {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("SpringIOC/player-country.xml");
        Player p1=(Player)c.getBean("player1");
        Player p2=(Player)c.getBean("player2");
        Player p3=(Player)c.getBean("player3");
        Player p4=(Player)c.getBean("player4");
        Player p5=(Player)c.getBean("player5");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
	}

}
