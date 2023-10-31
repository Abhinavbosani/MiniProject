package Wipro_Training.MultiThreading;

public class Question5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


            System.out.println("Running :" + getName() + " " + i + " time");

        }
    }


    public static void main(String[] args) {
        Question5 q1=new Question5();
        q1.setPriority(MAX_PRIORITY);
        Question5 q2=new Question5();
        q2.setPriority(MIN_PRIORITY);
        Question5 q3=new Question5();
        q3.setPriority(NORM_PRIORITY);
        q1.start();
        q2.start();
        q3.start();



    }
}
