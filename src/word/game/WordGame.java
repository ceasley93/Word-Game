package word.game;

import java.util.Scanner;

public class WordGame {

    // Variables
    private static String word;
    private static String hint;
    
    private final static int TOTAL_GUESSES = 3;
    
    // Main Method - Used for getting input
    public static void main(String[] args) {
        
        // Get Scanner variables here
        
        // Variables for guesses, input and boolean for compare returned value.
        Scanner input = new Scanner(System.in);
        
        String userInput;
        boolean isWord = false;
        int i = 0;
        
        generateWord();
        
        // Loop until the game either runs out of guesses or the user gets the word correct.
        GuessingGame:
        while (!isWord) {
            
            System.out.print("Enter in your guess >> ");
            userInput = input.nextLine();
            
            isWord = Compare(userInput);
            
            if (isWord) {
                
                // End Loop
                break GuessingGame;
                
            }
            
            if (i == 1) {
                
                System.out.println("Hint: " + hint);
                
            } 
            i++;
            
        }
        
        // Ifstatement if the answer was gotten or if the guesses ran out.
        if(isWord)
            System.out.println("You got it correct! The word is " + word);
        else
            System.out.println("You ran out of guesses. The word was " + word);
    }
    
    // Compare - Compares
    public static boolean Compare(String userInput) {
        
        if (userInput.equalsIgnoreCase(word)) {
            
            return true;
            
        }
        
        return false;
        
    }
    
    // Generate Word - Generates a random number anduses it as the index of an array.
    public static void generateWord() {
        
         String[][] wordsAndHints = {{"Cow", "Moo"},{"Cat", "Meow"},{"Dog","Woof"},{"Duck","Quack"},{"Phone","Ring,Ring"},{"Snake","Hiss"}};
        
        int randomNum;
        
        randomNum = (int)(Math.random() * ((wordsAndHints.length - 1) + 1)) + 0;    
              
        word = wordsAndHints[randomNum][0];
        hint = wordsAndHints[randomNum][1];
        
        
    }
    
}
