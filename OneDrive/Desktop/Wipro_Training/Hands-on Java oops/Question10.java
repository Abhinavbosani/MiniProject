package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = s.substring(0, 2);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(a);
        }

    }
}
