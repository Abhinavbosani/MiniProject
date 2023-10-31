package Wipro_Training.IOandSerialization;

import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFilename = scan.nextLine();
        System.out.println("Enter the output file name");
        String outputFilename = scan.nextLine();

        File filein = new File(inputFilename);
        File fileout = new File(outputFilename);

        BufferedReader br = new BufferedReader(new FileReader(filein));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));

        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        };
        System.out.println("File is copied");
        br.close();
        bw.close();
    }

}
