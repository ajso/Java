package VowelsPresent;

//Vowels are a,e,i,o,u
//Using Regular expression we can check if they are present in a word.

import java.util.Scanner;

public class CheckForVowels {


    public static boolean containsVowel(String st){
        return st.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        CheckForVowels checkForVowels = new CheckForVowels();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word with potential Vowels:");
        String myWord = scanner.nextLine();

        if(checkForVowels.containsVowel(myWord) == true){
            System.out.println("The Word has Vowels");
        }else {
            System.out.println("This Word does not have Vowels");
        }

        //System.out.println(checkForVowels.containsVowel(myWord) +" The word has Vowels");
    }
}
