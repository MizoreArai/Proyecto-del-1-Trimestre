import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        // Ask for numbers
        askNumbers();
        // Create variable to save numbers
        int[] numbers = new int[10];
        // Initialize counter
        int counter = 0;
        // While the counter is less than 10
        do {
            // Read the number and save it
            numbers[counter] = readNumber();
            // Increase the counter
            counter++;
        } while (counter < 10);
        // Sum the numbers and save the result
        int result = sumNumbers(numbers);
        // Show the result
        showResult(result);
    }

    // Corrected method name
    private static void showResult(int result) {
        System.out.println("The sum of the entered numbers is: " + result);
    }

    private static int sumNumbers(int[] numbers) {
        int result = 0;
        // Sum the numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    private static int readNumber() {
        // Read user input
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }

    private static void askNumbers() {
        // Ask the user to input numbers
        System.out.println("Enter numbers: ");
    }
}

