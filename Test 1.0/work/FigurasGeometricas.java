package work;

import java.util.Scanner;


public class figurasGeometricas {
    public static void main(String[] args) {
        while (true) { 
            menu();
            preguntaOpcion();
            int opcion = leerOpcion();

            double valor1 = 0; //Lado, base 1
            double valor2 = 0; // Lado 2, altura, apotema
            double valor3 = 0; //Lado 2 del triangulo
            double valor4 = 0; //Lado 3 del triangulo

            if (opcion == 0)
            {
                System.out.println("El programa ha terminado.\n¡Gracias por su visita!");
                break;
            }
            else if (opcion < 0 || opcion > 4)
            {
                System.out.println("Valor no válido. ¡Inténtalo otra vez!\n");
            }

            while (opcion>0 && opcion<5)
            {
                System.out.println("\nEscriba  el  valor  del  primer  lado  (base)  de  la figura: ");
                valor1 = leerValor();
                
                if (opcion == 1)
                {
                    
                    double perimetro = valor1*4; //valor1 = lados del cuadrado
                    double area = valor1*valor1;

                    System.out.println("El área del cuadrado es " + area + " y su perímetro es " + perimetro + ".\n");
                    break;
                }
                else if (opcion == 2)
                {
                    System.out.println("\nEscriba la altura del rectángulo: ");
                    valor2 = leerValor();

                    double area = valor1*valor2; //valor1 = base, valor2 = altura del rectángulo. 
                    double perimetro = valor1*2 + valor2*2;

                    System.out.println("El área del rectángulo es " + area + " y su perímetro es " + perimetro + ".\n");
                    break;
                }
                else if (opcion == 3)
                {
                    System.out.println("\nEscriba el lado 2 del triángulo: ");
                    valor3 = leerValor();
                    System.out.println("\nEscriba el lado 3 del triángulo: ");
                    valor4 = leerValor();
                    System.out.println("\nEscriba la altura del triángulo: ");
                    valor2 = leerValor();

                    double perimetro = valor1 + valor3 + valor4; //valor1 = base, valor 3 y 4 = lados del triángulo
                    double area = (valor1*valor2)/2; //valor2 = altura del triángulo

                    System.out.println("El área del triángulo es " + area + " y su perímetro es " + perimetro + ".\n");
                    break;
                }
                else if (opcion == 4)
                {
                    System.out.println("\nEscriba la altura del pentángulo: ");
                    valor2 = leerValor();

                    double perimetro = valor1*5; //valor1 = lado del pentágulo
                    double area = (perimetro*valor2)/2; //valor2 = apotema del pentágulo

                    System.out.println("El área del pentángulo es " + area + " y su perímetro es " + perimetro + ".\n");
                    break;
                }
            }
        }
    }

    private static double leerValor()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextDouble();
    }
    private static int leerOpcion()
    {
        Scanner keys = new Scanner(System.in);
        return keys.nextInt();
    }
    private static void preguntaOpcion()
    {
        System.out.println("Escoja una opción: ");
    }
    private static void menu()
    {
        System.out.println("FIGURAS GEOMÉTRICAS\r\n1. Triángulo\r\n2. Rectángulo\r\n3. Cuadrado\r\n4. Pentágono\r\n0. Salir\r\n");
    }

}
