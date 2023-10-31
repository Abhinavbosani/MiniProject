package Wipro_Training.MultiThreading;

import static java.lang.Thread.MAX_PRIORITY;

public class MiniProject extends Thread{
    Thread t=new Thread();

    MiniProject(String name){
        t.setName(name);

        if(name.equalsIgnoreCase("Hare")){
            t.setPriority(MAX_PRIORITY);
        }



    }


    @Override
    public void run() {
        System.out.println("Race Started");
        for (int i = 1; i <=100; i++) {
            if (i==100){

                System.out.println("Congratulations! "+t.getName()+" you won the Race");

//                if (t.getName().equalsIgnoreCase("hare")&&i==61){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
                System.exit(0);

                break;

            }
            if (t.getName().equalsIgnoreCase("hare")&&i==61){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(t.getName()+" ran "+i+" meters");


        }

    }

    public static void main(String[] args) {
        MiniProject n=new MiniProject("Hare");
        MiniProject n1=new MiniProject("Tortoise");
        n.start();
        n1.start();


    }
}
