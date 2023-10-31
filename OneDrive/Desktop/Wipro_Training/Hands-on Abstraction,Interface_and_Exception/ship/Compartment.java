package Wipro_Training.AbstractionAndException.ship;

public class Compartment {
    int height;
    int width;
    int breadth;
    public Compartment(int h,int w,int b){
        height=h;
        width=w;
        breadth=b;
    }
    public String toString(){
        return "height:"+height+" width:"+width+" breadh:"+breadth;
    }
}
