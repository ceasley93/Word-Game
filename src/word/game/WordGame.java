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
        boolean isWord;
        
        generateWord();
        
        // Loop until the game either runs out of guesses or the user gets the word correct.
        GuessingGame:
        for (int i = 0; i < TOTAL_GUESSES; ++i) {
            
            System.out.print("Enter in your guess >> ");
            userInput = input.nextLine();
            
            isWord = Compare(userInput);
            
            if (isWord) {
                
                // End Loop
                break GuessingGame;
                
            }
            
            if (i == 2) {
                
                System.out.println("Hint: " + hint);
                
            } 
            
        }
        
        // Ifstatement if the answer was gotten or if the guesses ran out.
        
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
        
        String[][] wordsAndHints = {{"Cow", "Moo"},{"Cat", "Meow"}};
        
        int randomNum;
        
        randomNum = (int)(Math.random() * ((wordsAndHints.length - 0) + 1)) + 0;
        
        System.out.println(randomNum);
              
        word = wordsAndHints[randomNum][0];
        hint = wordsAndHints[randomNum][1];
        
        
    }
    
}
