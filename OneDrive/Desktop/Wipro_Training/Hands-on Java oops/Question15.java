package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int a=s.indexOf('*');
        System.out.println(s.substring(0,a-1)+s.substring(a+2,s.length()));
//        for (int i=0;i<s.length();i++){
//            if(s.charAt(i)=='*'){
//
//
//
//            }
//        }

    }
}
