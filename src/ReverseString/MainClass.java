package ReverseString;

import java.util.Scanner;

import static java.lang.System.exit;

public class MainClass {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the String to Reverse:");
            String myString = scanner.nextLine();

            if(myString == ""){
                System.out.println("Input Can not be null");

            }

            ReverseClass reverseClass = new ReverseClass();
//            String reversed = reverseClass.reverse(myString);

            System.out.println("===================reversed===========");
//            System.out.println(reversed);

    }
}
