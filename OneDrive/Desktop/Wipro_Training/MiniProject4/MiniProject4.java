package Wipro_Training.IOandSerialization;

import java.io.*;
import java.util.Scanner;
import java.io.Serializable;

class Employee1 implements Serializable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }

}

public class MiniProject4 {
    public static void main(String[] args)
            throws IOException, FileNotFoundException, ClassNotFoundException {

        Scanner scan = new Scanner(System.in);
        int choice = 0;

        String filename = "Employee.txt";

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Employee1 emp = new Employee1();
                    System.out.print("Enter Employee ID: ");
                    emp.setId(scan.nextInt());
                    scan.nextLine();
                    System.out.print("Enter Employee Name: ");
                    emp.setName(scan.nextLine());
                    System.out.print("Enter Employee Age: ");
                    emp.setAge(scan.nextInt());
                    System.out.print("Enter Employee Salary: ");
                    emp.setSalary(scan.nextDouble());
                    oos.writeObject(emp);
                    break;
                case 2:
                    System.out.println("----Report-----");
                    emp = null;
                    while (fis.available() > 0) {
                        emp = (Employee1) ois.readObject();
                        System.out.println(emp);
                    }
                    System.out.println("----End of Report-----");
                    break;
                case 3:
                    System.out.println("Exiting the System");
            }
        } while (choice != 3);
        fos.close();
        oos.close();
        fis.close();
        ois.close();
        scan.close();
    }
}
