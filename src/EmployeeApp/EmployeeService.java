package EmployeeApp;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<EmployeeModel> employeeHashSet = new HashSet<EmployeeModel>();

    EmployeeModel employee1 = new EmployeeModel(101, "Ecurut", 35, "IT",
            "Developer", 25000);
    EmployeeModel employee2 = new EmployeeModel(102, "Bernic Wang", 28, "Engineering",
            "Technician", 50000);
    EmployeeModel employee3 = new EmployeeModel(101, "Esther", 30, "Finance",
            "Accountant", 36000);


    Scanner sc = new Scanner(System.in);

    public EmployeeService() { //employee service constructor
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
    }

    //View all Employees.
    public void viewAllEmployees(){
        for (EmployeeModel emp:employeeHashSet) { //foreach to display all employees
            System.out.println(emp);
        }
    }
}
