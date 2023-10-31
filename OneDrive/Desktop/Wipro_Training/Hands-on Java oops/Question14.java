package Wipro_Training.oopsAndStrings;

public class Question14 {
    public static void main(String[] args) {
        String s="xHix";
        if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x'){
            System.out.println(s.substring(1,s.length()-1));

        }else{
            System.out.println(s);
        }

    }
}
