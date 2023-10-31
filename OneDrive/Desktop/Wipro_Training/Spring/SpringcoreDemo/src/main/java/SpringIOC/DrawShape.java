package SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.buffer.DataBuffer;

import com.springcore.SpringcoreDemo.DefaultMessage;

class DrawShape {
    private Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }


    public static void main(String[] args) {
    	
    	
    	
    	System.out.println( "Started" );
        ApplicationContext c=new ClassPathXmlApplicationContext("SpringIOC/shape.xml");
        Shape s=(Shape)c.getBean("rectangle");
        s.draw();
        
        
        
//        Triangle t=c.getBean("tri",Triangle.class);
//        Rectangle r=c.getBean("rec",Rectangle.class);
//        Parallelogram p=c.getBean("para",Parallelogram.class);
//        t.draw();
//        r.draw();
//        p.draw();
       
        
    }
   }

