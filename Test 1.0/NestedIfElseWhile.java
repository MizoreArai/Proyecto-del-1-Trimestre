import java.util.Scanner;

public class NestedIfElseWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Prompt the user to input a number
            System.out.println("Enter a number (1-5) or 0 to exit:");
            int input = scanner.nextInt();

            if (input > 0 && input <= 5) {
                // First if/else block
                if (input <= 3) {
                    // Second nested if/else block
                    if (input == 1) {
                        System.out.println("You chose number 1.");
                    } else if (input == 2) {
                        System.out.println("You chose number 2.");
                    } else {
                        System.out.println("You chose number 3.");
                    }
                } else {
                    // If input is 4 or 5
                    if (input == 4) {
                        System.out.println("You chose number 4.");
                    } else {
                        System.out.println("You chose number 5.");
                    }
                }
            } else if (input == 0) {
                // If user wants to exit
                System.out.println("Exiting program...");
                continueProgram = false; // Stop the loop
            } else {
                // Invalid input case
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        
        System.out.println("Program terminated.");
    }
}
