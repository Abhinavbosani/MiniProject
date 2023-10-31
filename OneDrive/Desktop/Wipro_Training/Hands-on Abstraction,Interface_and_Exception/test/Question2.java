package Wipro_Training.AbstractionAndException.test;

import Wipro_Training.AbstractionAndException.test.Foundation;

public class Question2 {
    public static void main(String[] args) {


        Foundation f = new Foundation();
      //int a=f.var1;   -----> Error
        int b = f.var2;
        int c = f.var3;
        int d = f.var4;
        System.out.println("Var2="+b);
        System.out.println("Var3="+c);
        System.out.println("Var4="+d);

    }
}
