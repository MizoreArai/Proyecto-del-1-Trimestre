import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Prompt the user to enter 10 positive integers
        System.out.println("Introduzca 10 números enteros positivos: ");

        // Read 10 positive integers
        for (int i = 0; i < 10; i++) {
            int input = scanner.nextInt();
            if (input > 0) {
                numeros[i] = input;
            } else {
                System.out.println("El número no es positivo. Inténtalo de nuevo:");
                i--; // Decrement i to re-enter the value
            }
        }

        // Sort the array in descending order
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) { // Swap if the current element is smaller than the next
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Print the array in descending order
        System.out.print("\nEl orden de mayor a menor es: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
