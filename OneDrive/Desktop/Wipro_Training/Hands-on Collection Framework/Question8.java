package Wipro_Training.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

class Country{
    HashSet<String> H1=new HashSet<>();
    HashSet<String> saveCountryNames(String countryName){
        H1.add(countryName);
        return H1;

    }
    String getCountry(String countryName){
        Iterator it=H1.iterator();
        while(it.hasNext()){
            if (it.next().equals(countryName)){
                return countryName;
            }

        }
        return null;
    }
}
public class Question8 {
    public static void main(String[] args) {
        Country c=new Country();
        c.saveCountryNames("India");
        c.saveCountryNames("China");
        c.saveCountryNames("France");
        c.saveCountryNames("USA");
        c.saveCountryNames("Mexico");
        c.saveCountryNames("Germany");
        System.out.println(c.saveCountryNames("South Korea"));
        System.out.println(c.getCountry("India"));

    }
}
