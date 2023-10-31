package Wipro_Training.AbstractionAndException.Automobile.twoWheeler;

import Wipro_Training.AbstractionAndException.Automobile.FourWheeler.Ford;
import Wipro_Training.AbstractionAndException.Automobile.FourWheeler.Logan;

public class Test {
    public static void main(String[] args) {
        Hero h=new Hero("Hero splendor","a2306g5","Abhinav",80);
        System.out.println("Model: "+h.getModelName());
        System.out.println("Registration Number: "+h.getRegistrationNumber());
        System.out.println("Owner: "+h.getOwnerName());
        System.out.println("Speed: "+h.getSpeed()+"kmph");
        h.radio();
        System.out.println("------------------------------------------");
        Honda h1=new Honda("Honda CBZ","A095h20","Ravi",100);
        System.out.println("Model: "+h1.getModelName());
        System.out.println("Registration Number: "+h1.getRegistrationNumber());
        System.out.println("Owner: "+h1.getOwnerName());
        System.out.println("Speed: "+h1.getSpeed()+"kmph");
        h1.cdplayer();
        System.out.println("------------------------------------------");
        Logan l=new Logan("Logan Express","hhf0t9y8","David",150);
        System.out.println("Model: "+l.getModelName());
        System.out.println("Registration Number: "+l.getRegistrationNumber());
        System.out.println("Owner: "+l.getOwnerName());
        System.out.println("Speed: "+l.Speed()+"kmph");
        l.gps();
        System.out.println("------------------------------------------");
        Ford f=new Ford("Ford Endeavour","hhf10108","Peter",120);
        System.out.println("Model: "+f.getModelName());
        System.out.println("Registration Number: "+f.getRegistrationNumber());
        System.out.println("Owner: "+f.getOwnerName());
        System.out.println("Speed: "+f.Speed()+"kmph");
        f.tempControl();

    }
}
