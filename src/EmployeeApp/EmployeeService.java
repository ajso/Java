package EmployeeApp;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;
    boolean found = false;

    HashSet<EmployeeModel> employeeHashSet = new HashSet<EmployeeModel>();

    EmployeeModel employee1 = new EmployeeModel(101, "Ecurut", 35, "IT",
            "Developer", 25000);
    EmployeeModel employee2 = new EmployeeModel(102, "Bernic Wang", 28, "Engineering",
            "Technician", 50000);
    EmployeeModel employee3 = new EmployeeModel(103, "Esther", 30, "Finance",
            "Accountant", 36000);


    Scanner sc = new Scanner(System.in);

    public EmployeeService() { //employee service constructor
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
    }

    //View all Employees.
    public void viewAllEmployees() {
        for (EmployeeModel emp : employeeHashSet) { //foreach to display all employees
            System.out.println(emp);
        }
    }

    //View Employee by Id
    public void viewEmpById() {

        System.out.println("Enter Employee Id:"); //prompt user to enter the employee id
        id = sc.nextInt(); //receive the entered id
        for (EmployeeModel emp : employeeHashSet) { //loop through all the available dataset
            //check if the id entered by user exists in the dataset
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No User Found with id " + id);
        }

    }

    //method to update Employee
    public void updateEmployee() {
        System.out.println("Enter Employee ID to Update:");
        id = sc.nextInt();
        for (EmployeeModel emp : employeeHashSet) {

            if (emp.getId() == id) {
                System.out.println("Enter New employee Name:");
                name = sc.next();
                System.out.println("Enter New employee Salary:");
                salary = sc.nextDouble();

                //set the new name
                emp.setName(name);
                emp.setSalary(salary);
                System.out.println("============Updated=============");
                System.out.println(emp);
                found = true;
            }

        }
        if (!found) {
            System.out.println("No User Found with id " + id);
        } else {
            System.out.println("Employee with id " + id + " Updated Successfully.");
        }
    }

    public void deleteEmployee() {
        System.out.println("Enter Employee ID to be Deleted:");
        id = sc.nextInt();
        EmployeeModel delete = null;
        for (EmployeeModel emp : employeeHashSet) {
            if (emp.getId() == id) {
                delete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No User Found with id " + id);
        } else {
            employeeHashSet.remove(delete);
            System.out.println("Employee with id " + id + " Deleted Successfully.");
        }

    }

    //Add new Employee.
    public void addEmployee() {
        System.out.println("Enter New Employee ID:");
        id = sc.nextInt();
        System.out.println("Enter Employee Name:");
        name = sc.next();
        System.out.println("Enter Employee Age:");
        age = sc.nextInt();
        System.out.println("Enter Employee Department:");
        department = sc.next();
        System.out.println("Enter Employee Designation:");
        designation = sc.next();
        System.out.println("Enter Employee Salary:");
        salary = sc.nextDouble();

        EmployeeModel emp = new EmployeeModel(id, name, age, department, designation, salary);
        employeeHashSet.add(emp);
    }

}
