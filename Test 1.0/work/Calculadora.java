package work;

import java.util.Scanner;

public class calculadora 
{
    public static void main(String[] args) 
    {
        while (true) 
        { 
            menu();
            preguntaOpcion();
            int opcion = leerOpcion();
            double operando1 = 0;
            double operando2 = 0;

            if (opcion == 0) //Option 0: User wants to exist
            {
                System.out.println("Programa terminado. \nGracias por tu visita!");
                break;
            } 

            while (opcion >= 1 && opcion <= 4)
            {
                System.out.println("Escriba el valor del primer operando: ");
                operando1 = leerOpcion();
                System.out.println("Escriba el valor del segundo operando: ");
                operando2 = leerOpcion();

                if (opcion == 1) //Option 1: User wants to use addition function
                {
                    double resultado = operando1 + operando2;
                    System.out.println("El resultado de la operación es: " + resultado + "\n");
                    break;

                }
                else if (opcion == 2) //Option 2: User wants to use subtraction function
                {
                    double resultado = operando1 - operando2;
                    System.out.println("El resultado de la operación es: " + resultado + "\n");
                    break;
                }
                else if (opcion == 3) //Option 3: User wants to use multiply function
                {
                    double resultado = operando1 * operando2;
                    System.out.println("El resultado de la operación es: " + resultado + "\n");
                    break;
                }
                else if (opcion == 4) //Option 4: User wants to use division function
                {
                    double resultado = operando1 / operando2;
                    System.out.println("El resultado de la operación es: " + resultado + "\n");
                    break;
                }
            }

            if (opcion < 1 || opcion > 4) //If the user enters an invalid option
            {
                System.out.println("Opción inválida.\n¡Por favor, elije un valor de 0 a 4!\n");
            }
        }
    }

    private static int leerOpcion()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }
    private static void preguntaOpcion()
    {
        System.out.println("Escoje una opción: ");
    }
    private static void menu()
    {
        System.out.println("""
            CALCULADORA
            1. Suma
            2. Resta
            3. Producto
            4. División
            0. Salir
                """);
    }
}
