/*
 * Program: Collatz Conjecture
 * Author: Rafay
 * Student Number: 787636
 * Description: This program generates the Collatz sequence for a given positive number.
 */

import java.util.Scanner;

public class CollatzConjecture {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean continueProgram = true; // Flag to control whether the user wants to continue

while (continueProgram) {
// Prompt the user to enter a positive number
System.out.print("Enter a whole number > 0: ");
int n = scanner.nextInt();

// Validate input
if (n <= 0) {
System.out.println("Invalid input. Please enter a positive whole number.");
continue; // Go back to asking for input
}

// Initialize variables
int currentNumber = n;
int termsCount = 0; // To count the number of terms in the sequence
int highestValue = n; // To track the highest number reached
StringBuilder sequence = new StringBuilder(); // To store the sequence

// Generate the Collatz sequence
while (currentNumber != 1) {
sequence.append(currentNumber).append("; "); // Add the current number to the sequence
termsCount++; // Increment the term count

// Update the highest value if the current number is larger
if (currentNumber > highestValue) {
highestValue = currentNumber;
}

// Apply the Collatz rules
if (currentNumber % 2 == 0) {
currentNumber /= 2; // If even, divide by 2
} else {
currentNumber = currentNumber * 3 + 1; // If odd, multiply by 3 and add 1
}
}

// Add the final "1" to the sequence and count the last term
sequence.append("1");
termsCount++;

// Output the results
System.out.println("The Collatz sequence for n = " + n + " is: " + sequence);
System.out.printf("Number of terms = %,d\n", termsCount);
System.out.printf("Highest value reached = %,d\n", highestValue);

// Ask the user if they want to try again
System.out.print("Do another? (y/n): ");
char response = scanner.next().charAt(0);
continueProgram = (response == 'y' || response == 'Y'); // Continue if the user inputs 'y'
}

// End the program
System.out.println("Goodbye!");
scanner.close();
}
}
