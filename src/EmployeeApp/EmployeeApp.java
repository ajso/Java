package EmployeeApp;

import java.util.Scanner;

public class EmployeeApp {

    static boolean ordering = true;


    public static void menu(){

        //setting the menu.
        System.out.println(" ");
        System.out.println("=====Welcome to the Employee management Application====="
                +"\n1. Add Employee"
                +"\n2. View Employee"
                +"\n3. Update Employee"
                +"\n4. Delete Employee"
                +"\n5. View All Employees"
                +"\n6. Exit Application"
        );
    }
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        //do-while loop to iterate through our menu operations
        do {
            menu(); //Static method Call
            System.out.println("Select Option: "); //prompt user to select the options of the menu.
            int choice = scanner.nextInt(); //capture user's option.

            switch (choice){

                case 1:
                    System.out.println("Selection Option");
                    break;
                case 2:
                    System.out.println("=====Employee Details=====");
                    employeeService.viewEmpById();
                    break;
                case 3:
                    System.out.println("=====Update Employee=====");
                    employeeService.updateEmployee();
                    break;
                case 4:
                    System.out.println("Selection Option");
                    break;
                case 5:
                    System.out.println("=====View All Emplyees=====");
                    employeeService.viewAllEmployees();
                    break;
                case 6:
                    System.out.println("Thank You For Using Our Application");
                    System.exit(0);

                default:
                    System.out.println("Please Enter a Valid Choice");
                    break;

            }
        }while (ordering);

    }
}
