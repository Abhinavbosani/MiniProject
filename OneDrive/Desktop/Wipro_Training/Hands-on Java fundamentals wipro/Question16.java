package Wipro_Training;

public class Question16 {
    public static void main(String[] args) {
        for (int j=10;j<=99;j++){
            if(primeornot(j)){
                System.out.print(" "+j);
            }
        }

    }
    static boolean primeornot(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }

        }
        if(count==2){
            return true;
        }
        else {
            return false;
        }
    }
    }


