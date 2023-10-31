package Wipro_Training.WrapperClasses;

class Employee implements Cloneable{
    String name;
    int age;
    double a;
    public Employee(String name,int age,double a){
        this.name=name;
        this.age=age;
        this.a=a;

    }
    Employee empClone(){
        try{
            return (Employee) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return this;
        }
    }

}

public class Question4 {
    public static void main(String[] args) {


        Employee e = new Employee("Abhinav", 21, 35);
        Employee e1 = e.empClone();
        System.out.println("The e is :"+e.name+" "+e.age+" "+e.a);
        System.out.println("The e1 is :"+e1.name+" "+e1.age+" "+e1.a);
        e.name="Akhil";
        e.age=18;
        e.a=45;
        System.out.println("The e is :"+e.name+" "+e.age+" "+e.a);
        System.out.println("The e1 is :"+e1.name+" "+e1.age+" "+e1.a);



    }
}
