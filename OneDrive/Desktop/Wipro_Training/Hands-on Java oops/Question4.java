package Wipro_Training.oopsAndStrings;

class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void sleep(){
        System.out.println("Sleeping");
    }

}
class Bird extends Animal{
    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }
    void fly(){
        System.out.println("Flying");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
