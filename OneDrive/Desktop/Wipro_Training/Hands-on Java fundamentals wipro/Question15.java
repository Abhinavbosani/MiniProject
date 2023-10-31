package Wipro_Training;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count=count+1;
            }

        }
        if(count==2){
            System.out.println("It is a prime");
        }
        else {
            System.out.println("It is not a prime");
        }
    }
}
