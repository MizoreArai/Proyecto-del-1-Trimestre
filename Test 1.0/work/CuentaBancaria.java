package work;


import java.util.Scanner;

public class cuentaBancaria 
{
    public static void main(String[] args) 
    {
        double saldoInicial = 0;

        while (true)
        {
            menuBanco();
            preguntaOpcion();
            int opcion = leerOpcion();

            if (opcion == 0)
            {
                System.out.println("Programa terminada. \nGracias por tu visita!\n");
                break;
            }
            else if (opcion == 1)
            {
                menuCuenta();
                System.out.println("Escoja una opción: ");
            	int opcion1 = leerOpcion();

                while (opcion1 == 1 || opcion1 == 2)
                {
                    saldoInicial = 0;
                    System.out.println("\nEscriba el saldo inicial: ");
                    saldoInicial = leerSaldo();

                    if (opcion1 == 1) //Cuenta normal
                    {
                        while (true)
                        {
                            if (saldoInicial >= 0)
                            {
                                System.out.println("\nTu cuenta tiene un saldo inicial de: " + saldoInicial + ".");
                                break;
                            }
                            else
                            {
                                System.out.println("\nLa cantidad debe ser positiva. ¡Por favor, inténtalo otra vez!");
                                break;
                            }
                        }
                        break;
                    }
                    else if (opcion1 == 2) //Cuenta premium
                    {
                        System.out.println("Tu cuenta tiene un saldo inicial de: " + saldoInicial + ".");
                        break;
                    }
                }

            	if (opcion1 == 0)
                {
                    continue;
            	}
                else if (opcion1 < 0 || opcion1 > 2)
                {
                    System.out.println("La opción introducida no es válida. \n");
                }
                
                
        	}
            else if (opcion == 2 || opcion == 3)
            {
                System.out.println("\nEscriba la cantidad: ");
                double cantidad = leerSaldo();

                if (saldoInicial == 0)
                {
                    System.out.println("\nError. No dispones una cuenta bancaria. ¡Inténtalo de nuevo! \n");
                }

                if (opcion == 2 && saldoInicial != 0)
                {
                    saldoInicial = saldoInicial + cantidad;
                    System.out.println("\nEl saldo de la cuenta es " + saldoInicial + ".");
                }
                else if (opcion == 3 && saldoInicial != 0)
                {
                    saldoInicial = saldoInicial - cantidad;
                    System.out.println("\nEl saldo de la cuenta es " + saldoInicial + ".");
                }
            }
            else if (opcion == 4)
            {
                if (opcion == 4 && saldoInicial != 0)
                {
                    System.out.println("\nEl saldo de la cuenta es " + saldoInicial + ".");
                }
                else 
                {
                    System.out.println("\nError. No dispones una cuenta bancaria. ¡Inténtalo de nuevo! \n");
                }
            }
            if (opcion < 0 || opcion > 4)
            {
                System.out.println("Opción no válida. ¡Inténtalo de nuevo! \n");
            } 
        } 
    }

    private static double leerSaldo()
    {
        Scanner keys =  new Scanner (System.in);
        return keys.nextDouble();
    }
    private static void menuCuenta()
    {
        System.out.println("\nTIPO DE CUENTA \r\n1. Cuenta normal \r\n2. Cuenta Premium \r\n0. Cancelar \r\n");
    }
    private static int leerOpcion()
    {
        Scanner keys =  new Scanner (System.in);
        return keys.nextInt();
    }
    private static void preguntaOpcion()
    {
        System.out.println("Escoja una opción: ");
    }
    private static void menuBanco()
    {
        System.out.println("\nBANCO \r\n1. Crear cuenta \r\n2. Ingresar dinero \r\n3. Retirar dinero \r\n4. Consultar saldo \r\n0. Salir \r\n");
    }
}
