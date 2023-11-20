package ReverseString;

import java.util.Scanner;

public class ReverseClass {

    public static String reverse(String st){

        if(st == null)
            throw new IllegalArgumentException("String cannot be null");
        StringBuilder sb = new StringBuilder();
        char[] chars = st.toCharArray();

        for (int i=chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        ReverseClass rc = new ReverseClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to Reverse:");
        String result = scanner.nextLine();

        if(result == ""){
            System.out.println("Please enter a text");

        }else {
            System.out.println(rc.reverse(result));
        }
    }

}
