package Wipro_Training.AbstractionAndException;


import java.util.Random;

abstract class Compartment{
    public abstract String notice();

}
class FirstClass extends Compartment{
    public String notice(){
        return "Hello,this is First Class";

    }

}
class Ladies extends Compartment{
    public String notice(){
        return "Hello,this is Ladies Class";

    }

}
class General extends Compartment{
    public String notice(){
        return "Hello,this is General Class";

    }

}
class Luggage extends Compartment{
    public String notice(){
        return "Hello,this is Luggage section";

    }

}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c=new Compartment[10];
        Random r=new Random();
        String b;
        for (int i = 0; i <c.length ; i++) {
            int a=r.nextInt(1,5);
            switch (a){
                case 1:
                    c[i]=new Luggage();
                    b=c[i].notice();
                    System.out.println(b);
                break;
                case 2:
                    c[i]=new Ladies();
                    b=c[i].notice();
                    System.out.println(b);
                break;
                case 3:
                    c[i]=new General();
                    b=c[i].notice();
                    System.out.println(b);
                break;
                case 4:
                    c[i]=new FirstClass();
                    b=c[i].notice();
                    System.out.println(b);
                break;
            }

        }


    }
}
