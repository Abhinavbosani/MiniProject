package Wipro_Training.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("hello");
        a.add("hi");
        a.add("name");
        printAll(a);

    }
    static void printAll(ArrayList<String> a){
        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
