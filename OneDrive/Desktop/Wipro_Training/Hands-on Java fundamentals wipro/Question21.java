package Wipro_Training;

public class Question21 {
    public static void main(String[] args) {
        int[] arr={1,3,2,7,6,8};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];

        }
        float avg=(float)sum/ arr.length;
        System.out.println(sum);
        System.out.println(avg);

    }
}
