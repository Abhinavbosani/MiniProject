package Wipro_Training;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(Character.isLowerCase(c)){
            System.out.println(c+"-->"+Character.toUpperCase(c));
        }
        else{
            System.out.println(c+"-->"+Character.toLowerCase(c));
        }
    }
}
