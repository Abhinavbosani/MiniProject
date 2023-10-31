package Wipro_Training.AbstractionAndException.Automobile.twoWheeler;



public class Hero extends Wipro_Training.AbstractionAndException.Automobile.Vehicle {
    private String ModelName;
    private String RegistrationNumber;

    private String OwnerName;
    private int speed;
    public Hero(String m,String r,String o,int s){
        ModelName=m;
        RegistrationNumber=r;
        OwnerName=o;
        speed=s;
    }
    public int getSpeed(){
        return speed;

    }
    public void radio(){
        System.out.println("Controlling Radio");
    }

    @Override
    public String getModelName() {
        return ModelName ;
    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    @Override
    public String getOwnerName() {
        return OwnerName;
    }
}
