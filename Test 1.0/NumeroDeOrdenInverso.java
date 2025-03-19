import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario


public class NumeroDeOrdenInverso {
    public static void main(String[] args) { 
        // Creamos un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner Scanner = new Scanner(System.in); 
        
        // Pedimos al usuario que introduzca 10 números enteros positivos
        System.out.println("Introduzca 10 números enteros positivos: ");
        // Declaramos un arreglo de enteros para almacenar los 10 números
        int[] numeros = new int[10];

        // Bucle infinito, que continuará pidiendo números y mostrando resultados sin fin
        while (true) { 
            // Recorremos el arreglo para almacenar los 10 números introducidos por el usuario
            for (int i = 0; i < 10; i++) {
                // Leemos el número introducido por el usuario y lo almacenamos en el arreglo
                numeros[i] = Scanner.nextInt();
                // Si el número es negativo, mostramos un mensaje de error
                if (numeros[i] < 0) {
                    System.out.println("\nEl número no es positivo. Inténtalo de nuevo:");
                    i = i -1;
                }
            }
            System.out.print("\nEl orden inverso es: ");
            for (int i = 9; i >= 0; i--) {
                 // Imprimimos el orden inverso de los números introducidos
                System.out.print(numeros[i] + " ");
            }
            // Salimos del bucle while
            break;
        }   
    }
}
