import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //Ask the 'secret number'
        askSecretNumber();
        //Read the 'secret number' and save
        int secretNumber = readNumber();
        //Ask the 'maximum number of tries'
        askMaxTries();
        //Read the 'maximum number of tries' and save it
        int maxTries = readNumber();
        //Save the 'number of tries'
        int triesNumber = 0;

        //While user doesn't reach the max. number of tries
        while (triesNumber < maxTries){
            //Generate the aleatory number and save it
            int randomNumber = generateRandomNumber(1, 10);
            //+1 try
            triesNumber++; //triesNumber = triesNUmber + 1; tries number += 1;
            //Write the generated number
            System.out.println("The generated number is " + randomNumber);
            //Revise the aleatory number
            reviseRandomNumber(randomNumber, secretNumber, maxTries, triesNumber);
            //If the aleatory number was the secret number, end the loop
            if (randomNumber == secretNumber) {
                break;
            }
        }
    }
    private static void reviseRandomNumber(int randomNumber, int secretNumber, int maxTries, int triesNumber) {
        // ALL Auto-generated method stuff
        if (randomNumber == secretNumber){
            System.out.println("The secret number was found on try number " + triesNumber + ".");
        } else if (triesNumber == maxTries){
            System.out.println("The secret number was not found.");
        }
    }
    private static int generateRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min +1) + min;
    }
    private static void askMaxTries(){
        System.out.println("Enter the maximum number of tries: ");
    }
    private static int readNumber(){
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }
    private static void askSecretNumber(){
        System.out.println("From 1 to 10, enter a secret number: ");
    }
}
