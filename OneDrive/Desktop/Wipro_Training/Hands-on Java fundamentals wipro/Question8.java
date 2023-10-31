package Wipro_Training;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if((int)a>64&&(int)a<91||(int)a>96&&(int)a<123){
            System.out.println("Alphabet");

        }
        else if((int)a>47&&(int)a<58){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
