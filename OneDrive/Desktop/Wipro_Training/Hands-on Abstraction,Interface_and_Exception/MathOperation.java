package Wipro_Training.AbstractionAndException;

public class MathOperation {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);

            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("The sum of elemnets is: " + sum);
            System.out.println("The average of elements: " + sum / arr.length);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }

}
