package Wipro_Training;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        String g=args[0];
        int age=Integer.parseInt(args[1]);
//        Scanner sc =new Scanner(System.in);
//        String g=sc.next();
//        int age=sc.nextInt();
        if(g.equals("Female")){
            if(age>=1&&age<=58){
                System.out.println("The percentage of interest is 8.2%");
            }
            else if(age>=59&&age<=100){
                System.out.println("The percentage of interest is 9.2%");

            }
        }
        if(g.equals("Male")){
            if(age>=1&&age<=58){
                System.out.println("The percentage of interest is 8.4%");
            }
            else if(age>=59&&age<=100){
                System.out.println("The percentage of interest is 10.5%");

            }
        }


    }

}
