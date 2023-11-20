package PrimeNumber;

import java.util.Scanner;

/*
Prime numbers are numbers that have only two factors, 1 and themselves

For example, the first 5 prime numbers are 2, 3, 5, 7, and 11

 */
public class PrimeNumberCheck {

    public static boolean isPrime(int n){

        if(n==0 || n==1){

            return false;
        }

        if(n == 2){
            return true;
        }
         for(int i = 2; i<=Math.sqrt(n); i++){
             if(n%i == 0){
                 return false;
             }
         }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to Check:");
        int myNum = scanner.nextInt();
        if(isPrime(myNum)){
            System.out.println(myNum +" Is a prime number."); // true
        }else{
            System.out.println(myNum +" Is NOT a prime number."); // false
        }
    }
}
