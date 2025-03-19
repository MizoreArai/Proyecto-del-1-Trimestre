

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        

        int amount = 0; // Declare amount outside the loops to use it across multiple loops

        while (true) {
            // Ask for options
            ask();
            int option = readOption(); // Pass the scanner to the method

            if (option == 1) {
                // Display the amount saved and exit the program
                System.out.println("You have " + amount + " euros in the bank.\nExiting.");
                break;
            } else if (option == 2) {
                while (true) {
                    // Ask for the amount and save it
                    System.out.println("Write an amount:");
                    amount = readOption(); // Save the amount to use in the outer loop

                    System.out.println("You have " + amount + " euros in the bank.\n");
                    break; // Break the inner while loop and return to the first while
                }
            } else {
                // Handle invalid option
                System.out.println("Invalid option, please try again.");
            }
        }

    }

    private static int readOption() 
    {
        Scanner keys = new Scanner(System.in); // Declare scanner object
        return keys.nextInt(); // Return user input
    }

    private static void ask() {
        System.out.println("1. Display amount\n2. Enter an amount"); // Print the options
    }
}
