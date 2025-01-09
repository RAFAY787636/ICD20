import java.util.Scanner;

/*
 * Rock-Paper-Scissors Game
 * Author: Rafay Jamil
 * Student Number: 787636
 * Date: January 9, 2025
 
 * Title: Rock-Paper-Scissors Game
  
 * Description:
 * This program lets you play a Rock-Paper-Scissors game against the computer.
 * It keeps track of the number of wins, losses, and ties over a specified number of rounds.
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
        int numberOfGames = scanner

