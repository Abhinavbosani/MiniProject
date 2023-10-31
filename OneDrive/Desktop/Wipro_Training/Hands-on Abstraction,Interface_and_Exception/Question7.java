package Wipro_Training.AbstractionAndException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in array:");
            int s = sc.nextInt();
            int[] arr = new int[s];
            System.out.println("Enter the elements in array:");
            for (int i = 0; i < s; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println("Enter the element you want to access: ");
            int b = sc.nextInt();
            System.out.printf("The array element at index %d = %d\n", b, arr[b]);
            System.out.println("The array element accessed successfully");
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e);
        }
        //System.out.println("The array element accessed successfully");
    }
}
