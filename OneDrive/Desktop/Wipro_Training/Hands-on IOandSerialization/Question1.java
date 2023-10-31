package Wipro_Training.IOandSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name:");
        Scanner sc=new Scanner(System.in);
        String file=sc.nextLine();
        System.out.println("Enter the character to be counted: ");
        char c=sc.nextLine().charAt(0);
        if(c>=65&&c<=90)
            c+=32;
        FileInputStream f=null;
        int charCount=0;
        try {
            f = new FileInputStream(file);
            int i;
            do {
                i = f.read();
                char ch=(char)i;
                if ( ch>= 65 && ch <= 90) ch += 32;

                if (ch ==c)
                    charCount++;
            }
            while (i != -1);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            try{
                if (f!=null){
                    f.close();

                }
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
        System.out.println("File "+file+" has "+charCount+" instances of letter "+c);
        f.close();
        sc.close();

    }
}
