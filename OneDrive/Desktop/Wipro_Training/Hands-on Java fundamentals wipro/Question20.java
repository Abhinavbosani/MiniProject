package Wipro_Training;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int s=palindrome(num);
        if(num==s){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
        static int palindrome(int num){
        int sum = 0,r;
        while(num>0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;



        }
//        System.out.println(sum);

      return sum;
    }

}
