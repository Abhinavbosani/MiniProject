package Wipro_Training.AbstractionAndException;


class AgeError extends Exception{
    public AgeError(){
        System.out.println("Sorry!You are not in Age");
    }
}
public class Question11 {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            Question11 q=new Question11();
            q.age(name,age);
        }
        catch (NumberFormatException e){
            System.out.println("Please Enter the proper age");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter your name");
        }
        catch (AgeError e){
            System.out.println(e.getMessage());
        }

    }
    void age(String name,int a) throws AgeError{
        if (a<18&&a>=60){
            throw new AgeError();
        }
        else {
            System.out.println("Hello welcome");
        }


    }
}
