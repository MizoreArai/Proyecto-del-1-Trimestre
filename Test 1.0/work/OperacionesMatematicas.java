package work;


import java.util.Scanner;

public class operacionesMate {
    public static void main(String[] args) {

        int opcion;

        do {
            // Mostramos el menú al usuario
            System.out.println("\nPOTENCIAS Y RAICES CUADRADAS\n1. Potencia\n2. Raíz cuadrada\n3. Salir\n\nEscoja una opción: ");
            
            // Leemos la opción seleccionada por el usuario
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    // Potencia
                    System.out.print("\nIntroduzca el valor de la base: ");
                    double base = leerOpcionD();
                    System.out.print("\nIntroduzca el valor del exponente: ");
                    double exponente = leerOpcionD();
                    
                    // Calculamos la potencia usando Math.pow
                    double resultadoPotencia = Math.pow(base, exponente);
                    System.out.println("\nEl resultado de la operación es " + resultadoPotencia);
                    break;

                case 2:
                    // Raíz cuadrada
                    System.out.print("\nIntroduzca el operando: ");
                    double operando = leerOpcionD();
                    
                    // Calculamos la raíz cuadrada usando Math.sqrt
                    if (operando >= 0) {
                        double resultadoRaiz = Math.sqrt(operando);
                        System.out.println("\nEl resultado de la operación es " + resultadoRaiz);
                    } else {
                        System.out.println("\nError: no se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;

                case 3:
                    // Salir
                    System.out.println("\nEl programa ha terminado\n¡Gracias por su visita!");
                    break;

                default:
                    // Opción no válida
                    System.out.println("\nError: la opción introducida no es válida.");
            }
        } while (opcion != 3); // El programa continúa hasta que se escoja la opción de salir (3)

    }
    
    private static double leerOpcionD()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextDouble();
    }
    private static int leerOpcion()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }
}
