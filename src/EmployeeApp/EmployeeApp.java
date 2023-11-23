package EmployeeApp;

public class EmployeeApp {

    static boolean ordering = true;
    public static void menu(){

        //setting the menu.
        System.out.println("=====Welcome to the Employee management Application====="
                +"\n1. Add Employee"
                +"\n2. View Employee"
                +"\n3. Update Employee"
                +"\n4. Delete Employee"
                +"\n1. View All Employees"
                +"\n1. Exit Application"
        );
    }
    public static void main(String[] args) {

        EmployeeApp employeeApp = new EmployeeApp();
        employeeApp.menu();

    }
}
