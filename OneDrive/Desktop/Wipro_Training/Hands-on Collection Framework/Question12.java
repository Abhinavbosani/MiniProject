package Wipro_Training.CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap1 {
    private HashMap<String, String> M1;

    public CountryMap1() {
        M1 = new HashMap<String, String>();
    }

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();

            if (me.getValue().equals(capitalName))
                return me.getKey();
        }

        return null;
    }

    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<String, String>();

        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next();
            M2.put(me.getValue(), me.getKey());
        }

        return M2;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet())
            list.add(country);

        return list;
    }
}
public class Question12 {

    public static void main(String[] args) {
        CountryMap1 countryMap = new CountryMap1();

        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");

        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));

        HashMap<String, String> M2 = countryMap.swapKeyValue();
        System.out.println(M2);
        System.out.println(countryMap.toArrayList());
    }

}