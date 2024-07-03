package com.github.zipcodewilmington;
//Will
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wordguess {

    //System outprint a message to play
    public static void main(String[] args) {
        boolean isGameOn = true;
        Scanner scanner = new Scanner(System.in);

        while (isGameOn) {

            System.out.println("Let's Play Wordguess version 1.0!");

            //create an array of words
            String[] words = {"cat", "dog", "bog", "cut"};

            //Select random word

            Random random = new Random();
            String secretWord = words[random.nextInt(words.length)];

            //the number of tries allowed is set to the length of the word
            int numberOfGuess = secretWord.length();

            // the number of tries left
            int triesLeft = numberOfGuess;

            //   Setup up if word guess true or false variable
            boolean wordGuessed = false;

            // Scanner for user to guess word


//setup the two (the solution and the player's guesses) character arrays
            char[] solution = secretWord.toCharArray();
            char[] playerGuess = new char[solution.length];

            // Initialize the player guess with underscores to show unguessed letters

            Arrays.fill(playerGuess, '_');

//        WHILE the numbers of tries is less than tries allowed AND
//        the player has not guessed the word
//        print the current state of the player's guesses
//        ask the player for a letter (a character)

//    System.out.println("your word is: " + secretWord);
                while (triesLeft > 0 && !wordGuessed) {


                        System.out.println("Current Guess: ");
                        displayCurrentGuess(playerGuess);
                        System.out.println("You have" + " " + triesLeft + " " + "tries left.");
                        System.out.println("Enter a letter: ");
                        char guess = scanner.nextLine().toLowerCase().charAt(0);

                        boolean isCorrectGuess = false;
//
//    // Check if the guessed letter is in the solution
                        for (int i = 0; i < solution.length; i++) {
                            if (solution[i] == guess) {

                                playerGuess[i] = guess;
                                isCorrectGuess = true;

                            }
                        }

                        if (isCorrectGuess) {
                            System.out.println("Correct guess!");
                        } else {
                            triesLeft--;
                            System.out.println("Incorrect guess. Try again.");
                        }

                        if(Arrays.equals(solution, playerGuess)){
                            wordGuessed = true;
                        }

                    }

                if (wordGuessed) {
                    System.out.println("*** ****");
                    System.out.println(secretWord);
                    System.out.println("Congratulations, You Won");

                } else {
                    System.out.println(":-( :-( :-(");
                    System.out.println("You Lost! You ran out of guesses.");


                    // Ask to play again

//                    System.out.println("Would you like to play again? (yes/no)");
//                    String playAgain = scanner.nextLine().toLowerCase();
//
//                    if (!playAgain.equals("yes")) {
//                        isGameOn = false;
//                    } else {
////                        scanner.close();
//                        System.out.println("Game over!");
////                        scanner.close();
//
//                    }



            }
            System.out.println("Would you like to play again? (yes/no)");
                    String playAgain = scanner.nextLine().toLowerCase();

                    if (!playAgain.equals("yes")) {
                        isGameOn = false;
                    } else {
//                        scanner.close();
                        System.out.println("Game over!");
//                        scanner.close();

                    }

        }


    }


    //Method to display current guessed letter
    public static void displayCurrentGuess(char[] playerGuesses) {
        for (char letter : playerGuesses) {
            System.out.print(letter + " ");
        }
    }

    //Method to check if player guessed the word
//    public static boolean isWordGuessed(char[] playerGuesses) {
//        for (char letter : playerGuesses) {
//            if (letter == '_') {
//                return false;
//            }
//
//        }
//
//
//  return true;  }
}