package Wipro_Training.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
    private int empId;
    private String empName;
   private String email;
   private String gender;
   private float salary;
    public Employee(int empId, String empName, String email, String gender, float salary){
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.gender=gender;
        this.salary=salary;

    }
    void GetEmployeeDetails(){
        System.out.println("Employee ID : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee email : "+email);
        System.out.println("Employee gender : "+gender);
        System.out.println("Employee Salary : "+salary);
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }


}

class EmployeeDB {
    List<Employee> employeeDb = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee> it = employeeDb.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpId() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid employee id";

        for (Employee e : employeeDb) {
            if (e.getEmpId() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " + e.getSalary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[employeeDb.size()];
        for (int i = 0; i < employeeDb.size(); i++)
            empArray[i] = employeeDb.get(i);
        return empArray;
    }

}

public class Question2 {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(101, "Popeye", "popeye@sailor.man", "M", 25000);
        Employee emp2 = new Employee(102, "Rambo", "rambo@roc.ky", "M", 30000);
        Employee emp3 = new Employee(103, "Wick", "john@wi.ck", "M", 35000);
        Employee emp4 = new Employee(104, "Bond", "007@jam.es", "M", 40000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            emp.GetEmployeeDetails();

        System.out.println();
        empDb.deleteEmployee(101);

        for (Employee emp : empDb.listAll())
            emp.GetEmployeeDetails();

        System.out.println();

        System.out.println(empDb.showPaySlip(103));

    }
}
