package Wipro_Training;

public class Question6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No Arguments");
        } else {

            for (int i = 0; i < args.length; i++) {
                System.out.print("," + args[i]);

            }
        }
    }
}
