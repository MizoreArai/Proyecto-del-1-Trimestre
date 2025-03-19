

import java.util.Random;
import java.util.Scanner;

public class guessingGame 
{
    public static void main(String[] args) 
    { //Do/while can be used here
        while (true) // Use a while loop to create a menu that continues until the user chooses to exit
        {
            // Display the game MENU
            menu();
            // Prompt the user to choose an option
            askOption();
            // Read the user's input
            int option = readOption();

            if (option == 0) // Exit the game if the user chooses option 0
            {
                System.out.println("Program terminated. \nIt's nice to see you around. Please have a good time!");
                break; // Exits the loop and ends the program
            } 
            else if (option == 1) //Option 1: User guesses a number between 1 and 10, with 3 tries
            {
                System.out.println("You chose option 1 with 3 tries. \nThere is a secret number from 1 to 10.");
                
                int randomNumber = generateRandomNumber(1, 10); //Generate a random number between 1 and 10
                int guess = 0; //Variable to hold user's guess
                int tries = 0; //Variable to count the number of tries
                int maxTries = 3; //Maximum number of attempts allowed

                while (guess != randomNumber && tries < maxTries) //Loop until the user guesses the correct number or runs out of tries
                {
                    System.out.print("Please guess the number: ");
                    guess = readOption(); //Read user's guess

                    if (guess < 1 || guess > 10) 
                    {
                        System.out.println("Invalid input. Please enter a number between 1 and 10.");
                        continue; //Skip the rest of the loop and ask again without increasing tries
                    }

                    tries++; //Increment the try counter
                    int triesLeft = maxTries - tries; //Calculate how many tries are left

                    if (guess < randomNumber) //If the guess is TOO LOW and user still has tries left
                    {
                        System.out.println("Ugh... Too low! \nYou have " + triesLeft + " tries left.\n");
                    } 
                    else if (guess > randomNumber) //If the guess is TOO HIGH and user still has tries left
                    {
                        System.out.println("Wel... The value is too high! \nYou have " + triesLeft + " tries left.\n");
                    } 
                    else //If the user guesses the correct number within the allowed tries
                    {
                        System.out.println("Congrats! You guessed the number in " + tries + " tries.\n");
                    }
                    
                    
                    if (tries == maxTries && guess != randomNumber) //If the user runs out of tries without guessing correctly
                    {
                        System.out.println("You've run out of tries. \nThe secret number was: " + randomNumber + "\n");
                        break;
                    }
                }
            } 
            else if (option == 2) //Option 2: User guesses a number between 1 and 50, with 5 tries
            {
                System.out.println("You chose option 2 with 5 tries. \nThere is a secret number from 1 to 50.");
                
                int randomNumber = generateRandomNumber(1, 50); //Generate a random number between 1 and 50
                int guess = 0;
                int tries = 0;
                int maxTries = 5; //Maximum number of attempts allowed for option 2

                while (guess != randomNumber && tries < maxTries) //Same logic as in option 1, but with more possible numbers and tries
                {
                    System.out.print("Please guess the number: ");
                    guess = readOption();

                    if (guess < 1 || guess > 50) //Check if the guess is within the valid range
                    {
                        System.out.println("Invalid input. Please enter a number between 1 and 50.");
                        continue; //Skip the rest of the loop and ask again without increasing tries
                    }

                    tries++;
                    int triesLeft = maxTries - tries;

                    if (guess < randomNumber) 
                    {
                        System.out.println("Ugh... Too low! \nYou have " + triesLeft + " tries left.\n");
                    } 
                    else if (guess > randomNumber) 
                    {
                        System.out.println("Wel... The value is too high! \nYou have " + triesLeft + " tries left.\n");
                    } 
                    else 
                    {
                    System.out.println("Congrats! You guessed the correct number in " + tries + " tries.\n");
                    }
                    
                    if (tries == maxTries && guess != randomNumber) 
                    {
                        System.out.println("You've run out of tries. \nThe secret number was: " + randomNumber + "\n");
                        break;
                    }
                }
            }
            else //If the user enters an invalid option
            {
                System.out.println("Invalid option. \nPlease choose a number from 0 to 2.\n");
            }
        }
    }

    private static int generateRandomNumber(int min, int max) //Function to generate a random number within the given range
    {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min; //Generate a random number between min and max
    }

    private static int readOption() //Function to read user input
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextInt(); //Returns the user's input as an integer
    }

    private static void askOption() //Function to prompt the user to choose an option
    {
        System.out.println("Please choose an option: ");
    }

    private static void menu() //Function to display the game MENU
    {
        System.out.println("""
            1. Guess a number from 1 to 10 (3 tries)
            2. Guess a number from 1 to 50 (5 tries)
            0. Exit
            """);
    }
}
