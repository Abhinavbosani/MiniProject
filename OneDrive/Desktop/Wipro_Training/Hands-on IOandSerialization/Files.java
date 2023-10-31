package Wipro_Training.IOandSerialization;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee1 implements Serializable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class Files {
    private static final String FILE_NAME = "Q01_employees.txt";
    private static List<Employee1> employees = new ArrayList<Employee1>();

    public static void main(String[] args) {
        loadEmployees();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    saveEmployees();
                    System.out.println("Exiting the System");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
       List<Employee1> employees = new ArrayList<Employee1>();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee1 employee = new Employee1(id, name, age, salary);
        employees.add(employee);

        System.out.println("Employee added successfully!");
    }

    private static void displayAllEmployees() {
        System.out.println("\n----Report----");

        for (Employee1 employee : employees) {
            System.out.println(employee);
        }

        System.out.println("----End of Report-----");
    }

    private static void saveEmployees() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(employees);
            System.out.println("Employee data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving employee data.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadEmployees() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                employees = (List<Employee1>) inputStream.readObject();
                System.out.println("Employee data loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error occurred while loading employee data.");
                e.printStackTrace();
            }
        }
    }
}
