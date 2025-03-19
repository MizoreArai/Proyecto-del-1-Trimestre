package work;



import java.util.Scanner;

public class conversoMonedas 
{
    public static void main(String[] args) 
    {
        while(true)
        {                
            menu();
            preguntaOpcion();
            int opcion = leerOpcion(); 
            String euro = " \u20AC";

            if (opcion == 0)
            {
                System.out.println("Programa terminada. \nGracias por tu visita!\n");
                break;
            }
            else if (opcion < 1 || opcion > 3)
            {
                System.out.println("Opción no válida. ¡Inténtalo de nuevo! \n");
            }

            while (opcion >= 1 && opcion <= 3)
            {
                System.out.println("\nEscriba la cantidad: ");
                double cantidad = 0;
                cantidad = leerCantidad();

                if (opcion == 1 && cantidad >= 0)
                {
                    double resultado = cantidad * 0.86;
                    System.out.println("La cantidad de " + cantidad + " $ (dólares) en euros es " + resultado  + "€ (euros). \n");
                    break;
                }
                else if (opcion == 2 && cantidad >= 0)
                {
                    double resultado = cantidad * 1.19;
                    System.out.println("La cantidad de " + cantidad + " £ (libras) en euros es " + resultado + euro + " (euros). \n");
                    break;
                }
                else if (opcion == 3 && cantidad >= 0)
                {
                    double resultado = cantidad * 0.0075;
                    System.out.println("La cantidad de " + cantidad + " ¥ (yens) en euros es " + resultado + euro + " (euros). \n");
                    break;
                }
                else
                {
                    System.out.println("No calculamos las deudas. \n¡Por favor inténtalo de nuevo con un número positivo!");
                }
            }
        }
    }

    private static double leerCantidad()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextDouble(); //Returns the user's input as an integer
    }

    private static int leerOpcion()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextInt(); //Returns the user's input as an integer
    }
    private static void preguntaOpcion()
    {
        System.out.println("Escoja una opción: ");
    }
    private static void menu()
    {
        System.out.println("CONVERSOR DE MONEDAS  \r\n" +
                        " 1. Dólares  \r\n" +
                        " 2. Libras  \r\n" +
                        " 3. Yens \r\n" +
                        " 0. Salir \r\n");
    }
}
