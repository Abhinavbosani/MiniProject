package Wipro_Training.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question13{

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("Bangladesh", "Dhaka");

        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> me = itr.next();

            if (me.getKey().equals("Japan")) {
                System.out.println("Key Japan exists");
                break;
            }
        }

        set = map.entrySet();
        itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> me = itr.next();

            if (me.getValue().equals("Delhi")) {
                System.out.println("Value Delhi exists");
                break;
            }
        }

        set = map.entrySet();
        itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> me = itr.next();
            System.out.println(me);
        }
    }

}