package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder i=new StringBuilder();
        i.append(s);
        i.reverse();
        if(s.equalsIgnoreCase(String.valueOf(i))){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
