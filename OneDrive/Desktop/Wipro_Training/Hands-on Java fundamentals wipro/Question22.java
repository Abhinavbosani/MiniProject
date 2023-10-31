package Wipro_Training;

public class Question22 {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,8,9,7,10};
        int max=0;
        int min=32000;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
