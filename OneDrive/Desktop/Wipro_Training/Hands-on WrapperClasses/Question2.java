package Wipro_Training.WrapperClasses;

public class Question2 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        System.out.println("Given Number: "+a);
        System.out.println("Binary Equivalent: "+Integer.toBinaryString(a));
        System.out.println("Octal Equivalent: "+Integer.toOctalString(a));
        System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(a));

    }
}
