package Wipro_Training;

public class Question29 {
    public static void main(String[] args) {
        int[] arr={1,2,10,3,8,4,5,10,10,6,9,10};
        for (int i=0;i< arr.length;i++){
            if(arr[i]==10){
                arr[i]=0;

            }
        }
        for (int a:arr) {
            System.out.print(" "+a);

        }
    }
}
