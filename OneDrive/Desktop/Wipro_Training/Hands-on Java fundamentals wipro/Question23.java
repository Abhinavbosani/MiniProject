package Wipro_Training;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        int b=10;
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=present(arr,b);
        System.out.println(ans);
    }
        static int present(int[] arr,int b){
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == b) {
                    System.out.println("Element is present at index" );

                    return j;
                }

            }

                return -1;



        }

}
