package PrimeNumber;

public class PrimeNumbers {

    public static void main(String[] args) {
        int num = 100; //defines the limit
        int counter; //Initialize the counter for divisibility check.

        //Iterate from 1 to num to identify the prime numbers.
        for (int i =1; i<=num; i++){

            counter = 0; //reset the counter for each i

            //check the divisibility from 2 up to i/2
            for(int j = 2; j<=Math.sqrt(i); j++){

                if(i%j == 0){
                    counter++; //increment counter if 'i' is divisible by j
                    break; //exit the loop if the divisor is found
                }
            }

            //if counter is 0, i is a prime number
            if(counter == 0){
                System.out.print(i+", ");
            }
        }

    }
}
