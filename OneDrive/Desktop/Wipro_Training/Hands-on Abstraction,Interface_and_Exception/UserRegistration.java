package Wipro_Training.AbstractionAndException;



import java.util.Scanner;

class InvalidCountryException extends Exception{
    public InvalidCountryException(){
        System.out.println("User outside India cannot be Registered");
    }
}
public class UserRegistration {
    void registerUser(String username,String usercountry) throws InvalidCountryException{

            if (!usercountry.equalsIgnoreCase("India")) {
                throw new InvalidCountryException();
            }

        else{
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            String c = sc.next();
            UserRegistration u = new UserRegistration();

            u.registerUser(name, c);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }

}
