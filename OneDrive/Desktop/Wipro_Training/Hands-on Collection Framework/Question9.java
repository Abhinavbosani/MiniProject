package Wipro_Training.CollectionFramework;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
public class Question9{

    public static void main(String[] args) {
        HashSet<Employee> list = new HashSet<>();
        Employee emp1 = new Employee(101, "Popeye", "popeye@sailor.man", "M", 25000);
        Employee emp2 = new Employee(102, "Rambo", "rambo@roc.ky", "M", 30000);
        Employee emp3 = new Employee(103, "Wick", "john@wi.ck", "M", 35000);
        Employee emp4 = new Employee(104, "Bond", "007@jam.es", "M", 40000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);


        Iterator<Employee> it = list.iterator();
        while (it.hasNext())
            it.next().GetEmployeeDetails();



    }
    }

