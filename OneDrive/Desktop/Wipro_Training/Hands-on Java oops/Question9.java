package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String s1=s.toLowerCase();
        int a=s.indexOf(',')+1;
        int b=s.indexOf(',')-1;
        if (Character.toLowerCase(s.charAt(a))==Character.toLowerCase(s.charAt(b))){
            System.out.println(s1.substring(0,b)+s1.substring(a,s1.length()));
        }
        else{
            System.out.println(s1.substring(0,a-1)+" "+s1.substring(a,s1.length()));
        }

    }
}
