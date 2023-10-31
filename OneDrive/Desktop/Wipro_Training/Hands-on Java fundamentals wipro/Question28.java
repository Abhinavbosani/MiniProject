package Wipro_Training;

public class Question28 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 9, 0, 6, 4, 10, 11, 12, 7, 5, 13};

        int a = 0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                a = i;
            }
            if (arr[i] == 7) {
                 b = i;
            }
        }
        int sum=0;
        for (int j = 0; j< arr.length; j++) {
            if ( j < a || j > b) {
                sum += arr[j];


            }
        }
        System.out.println(sum);

    }


}
