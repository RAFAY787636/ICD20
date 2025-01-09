import java.util.Scanner;

/*
 * Rock-Paper-Scissors Game
 * Author: Rafay Jamil
 * Student Number: 787636
 * Date: January 9, 2025
 * 
 * Title: Rock-Paper-Scissors Game
 * 
 * Description:
 * This program lets you play a classic Rock-Paper-Scissors game against the computer.
 * It keeps track of the number of wins, losses,.
 * 
 * Variable Dictionary:
 * - scanner: Scanner object for reading user input.
 * - playerWins: Tracks the number of games the player has won.
 * - computerWins: Tracks the number of games the computer has won.
 * - ties: Tracks the number of games that resulted in a tie.
 * - numberOfGames: The total number of games the user wants to play.
 * - playerChoice: The player's choice (r, p, or s) for each game.
 * - computerChoiceNumber: Randomly generated number (0, 1, or 2) for the computer's choice.
 * - computerChoice: The computer's choice (r, p, or s) for each game.
 */

public class Assignment3 {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Variables for counting wins, losses, and ties
        int playerWins = 0; // Tracks the number of games the player wins
        int computerWins = 0; // Tracks the number of games the computer wins
        int ties = 0; // Tracks the number of tied games

        // Ask the user how many games they want to play
        System.out.print("How many games do you want to play? ");
        int numberOfGames = scanner.nextInt(); // Total number of games to play

        // Loop for each game
        for (int i = 1; i <= numberOfGames; i++) {
            // Ask the user for their choice
            System.out.print("Game " + i + ": Enter r for rock, p for paper, or s for scissors: ");
            char playerChoice = scanner.next().toLowerCase().charAt(0); // Player's choice

            // Make sure the input is valid
            while (playerChoice != 'r' && playerChoice != 'p' && playerChoice != 's') {
                System.out.print("Invalid input. Please enter r, p, or s: ");
                playerChoice = scanner.next().toLowerCase().charAt(0);
            }

            // Computer randomly picks 0, 1, or 2
            int computerChoiceNumber = (int) (Math.random() * 3); // Random number for computer's choice
            char computerChoice = ' '; // Computer's choice
            if (computerChoiceNumber == 0) {
                computerChoice = 'r';
            } else if (computerChoiceNumber == 1) {
                computerChoice = 'p';
            } else {
                computerChoice = 's';
            }

            // Print what the computer picked
            System.out.println("You chose: " + getChoiceName(playerChoice));
            System.out.println("Computer chose: " + getChoiceName(computerChoice));

            // Determine the winner
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win!");
                playerWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }
        }

        // Print the final results
        System.out.println("\nGame Over!");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);

        // Close the scanner
        scanner.close();
    }

    // This method converts the character choice into the full word
    public static String getChoiceName(char choice) {
        if (choice == 'r') {
            return "Rock";
        } else if (choice == 'p') {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
}
