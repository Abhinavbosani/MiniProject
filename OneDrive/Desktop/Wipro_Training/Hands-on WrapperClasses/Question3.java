package Wipro_Training.WrapperClasses;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&&a<=255){
          String s=String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
            System.out.println(s);

        }
        else {
            System.out.println("Enter between 1 and 255");
        }
    }
}
