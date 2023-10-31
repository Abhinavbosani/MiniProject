package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int a=s.indexOf(',');
        String s1=s.substring(0,a);
        String s2=s.substring(a+1);
        String s3=s1+s2;
        for(int i=0;i<a;i++){
            System.out.print(s3.charAt(i)+""+s3.charAt(i+a));
        }
    }
}
