package Wipro_Training.MultiThreading;

public class Question1 extends Thread{

//    Question1(String name,Thread t){
//
//       t.setName(name);
//       t.start();
//
//    }
//    public void run(){
//        System.out.println(this.getName());
//
//
//
//    }

    public static void main(String[] args) {
        Thread t1=new Thread();

       Thread t2=new Thread();
      t1.setName("Scooby");
      t2.setName("Shaggy");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }

}
