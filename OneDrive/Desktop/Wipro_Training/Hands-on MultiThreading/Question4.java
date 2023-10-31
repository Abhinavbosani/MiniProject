package Wipro_Training.MultiThreading;

public class Question4 implements Runnable{
    boolean eo=false;

    Question4(String n){
        if (n.equalsIgnoreCase("even")){
            eo=true;
        }
        else if(n.equalsIgnoreCase("odd")){
            eo=false;

        }


    }
    public void run() {
        if (eo){
            for (int i = 1; i <=20; i++) {
                if(i%2==0){
                    System.out.println(i);
                }

            }
            System.out.println("-------------------------------");

        }
        else {
            for (int i = 1; i <=20; i++) {
                if(i%2!=0){
                    System.out.println(i);
                }

            }

        }



    }

    public static void main(String[] args) throws InterruptedException {
        Question4 q1=new Question4("even");
        Thread t1=new Thread( q1);
        t1.start();
        t1.join();
        Question4 q2=new Question4("odd");
        Thread t2=new Thread(q2);
        t2.start();



    }
}
