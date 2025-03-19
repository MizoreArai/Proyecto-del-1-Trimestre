
import java.util.Scanner;

public class Switch {
    /*Make a menu*/
    public static void main(String[] args) {
        //Write the menu
        writeMenu();
        //Ask for oprion opción
        askOption();
        //Read the option and save
        int option = readOPtion();
        //Run the option's task
        runTask(option);
    }
    private static void runTask(int option){
        switch (option) {
            case 0: //String: "..." and boolean: True or False
                System.out.println("See ya next time!");
                System.exit(0);
            break;
            case 1: 
                System.out.println("You just chose option 1.");
            break;
            case 2: 
                System.out.println("You just chose option 2.");
            break;
            case 3: 
                System.out.println("You just chose option 3.");
            break;
            default:
                System.out.println("Are you a retard? Choose a number from 0 to 3.");
                throw new AssertionError();
        }
    }
    private static int readOPtion(){
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }
    private static void askOption(){
        System.out.println("Choose an option:");
    }
    private static void writeMenu(){
        System.out.println("""
                            PRINCIPAL MENU:
                                1. Option 1
                                2. Option 2
                                3. Option 3
                                0. Exit""");
    }
}
