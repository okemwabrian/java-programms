/*creating a simple guessing game where the programme generates a random number between
 * 1 and 1000 and the user has to guess it.
 */

import java.util.Random;
import java.util.Scanner;

public  class GuessingGame {
    public static void main(String[] args) {
        //generating a random number between 1 and 1000
        Random rand  = new Random();
        int numberToGuess = rand.nextInt(1000) + 1;
        Scanner scanner  = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Guess a number between 1 and 1000:");
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                    }
                    else{
                        System.out.println("You guessed it right!");
                    }
                    } while (guess != numberToGuess);
                    scanner.close();
                    }
                    }

