package Wipro_Training;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        //  int n=Integer.parseInt(args[0]);
        int n=0;
        if (args.length!=0) {
            n=Integer.parseInt(args[0]);
            for (int i = 0; i < n; i++) {


                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Please enter an integer");
        }
    }
}