package Wipro_Training;

import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 2, 3, 3, 2, 4, 5, 4, 5};
        Arrays.sort(a);
        segregateEvenOdd(a);
        System.out.println(Arrays.toString(a));
    }
        static void segregateEvenOdd(int arr[])
        {
            int left = 0, right = arr.length - 1;
            while (left < right)
            {
                while (arr[left]%2 == 0 && left < right)
                    left++;

                while (arr[right]%2 == 1 && left < right)
                    right--;

                if (left < right)
                {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

    }
}
