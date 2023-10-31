package Wipro_Training;

public class Question31 {
    public static void main(String[] args) {
        boolean a=true;
        int[] arr={1,4,1,4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1||arr[i]==4){
               a=true;
            }
            else{
                a=false;
                break;
            }


        }
        System.out.println(a);
    }
}
