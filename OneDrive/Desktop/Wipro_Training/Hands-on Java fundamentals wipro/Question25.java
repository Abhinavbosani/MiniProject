package Wipro_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (int i=0;i< arr.length;i++){

            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The Largest two numbers are:");
        System.out.println(arr[arr.length-2]+","+ arr[arr.length-1]);
        System.out.println("The smallest two elements are:");
        System.out.println(arr[0]+","+arr[1]);



    }
}
