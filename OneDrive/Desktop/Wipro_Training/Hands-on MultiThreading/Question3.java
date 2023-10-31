package Wipro_Training.MultiThreading;

public class Question3 implements Runnable{
    @Override
    public void run() {

        for (int i=1;i<=10;i++){

            if(i==5){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else
              System.out.println(i);
        }


    }

    public static void main(String[] args) {
        Question3 q=new Question3();
        Thread t=new Thread(q);
        t.start();


    }
}


