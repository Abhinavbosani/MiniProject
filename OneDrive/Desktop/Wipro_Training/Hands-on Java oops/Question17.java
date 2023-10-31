package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int a= sc.nextInt();
        String subS=s.substring(s.length()-a,s.length());
        for(int i=0;i<a;i++){
            System.out.print(subS);
        }
    }
}
