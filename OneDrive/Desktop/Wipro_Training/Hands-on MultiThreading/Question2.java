package Wipro_Training.MultiThreading;

import java.util.Random;

public class Question2 implements Runnable{


    @Override
    public void run() {
        String[] colors={"white","blue","black","green","red","yellow"};
        Random r=new Random();

        for (int i=0;i<colors.length;i++){
            int a=r.nextInt(0, colors.length);
            if(colors[a].equals("red")){
//                System.out.println(colors[a]);
                break;
            }
            else {
                System.out.println(colors[a]);
            }
        }


    }

    public static void main(String[] args) {
       Question2 q=new Question2();
       Thread t=new Thread(q);
       t.start();


    }
}
