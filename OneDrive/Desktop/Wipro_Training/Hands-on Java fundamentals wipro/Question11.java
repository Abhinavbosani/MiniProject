package Wipro_Training;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.nextLine().charAt(0);
        a=Character.toUpperCase(a);
        switch (a){
            case 'R':
                System.out.println("Red");
            break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Enter a valid code");

        }

    }
}
