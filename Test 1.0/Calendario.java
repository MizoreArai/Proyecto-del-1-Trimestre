import java.util.Scanner;
public class calendario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar variables para el calendario
        int dia = 0;
        int mes = 0;
        int anho = 0;
        String nombreMes = "";
        int diaMes = 0;
        String anho01 = "";

/* 1º WHILE PARA LOS DÍAS */
        while (true) { 
            // Introducir un dia de 1 a 31
            System.out.print("Introduzca un día: ");
            dia = scanner.nextInt();

            // Si el número es menor que 1 o mayor que 31, obligar que el usuario vuelva a intentar.
            if (dia < 1 || dia > 31) { 
                System.out.println("\nEl día introducido no es válido. \nInténtalo de nuevo con un valor del 1 al 31. ");
                continue;
            }
            break;
        }
        
        System.out.println("");
            
/* 2º WHILE PARA LOS MESES */
        while (true) { 
            // Introducir un mes de 1 a 12
            System.out.print("Introduzca un mes: ");
            mes = scanner.nextInt();

            // Si el número es menor que 1 o mayor que 12, obligar que el usuario vuelva a intentar.
            if (mes < 1 || mes > 12) {
                System.out.println("\nEl mes introducido no es válido. \nInténtalo de nuevo con un valor del 1 al 12.");
                continue;
            }

            // Poner un valor no numérico a los meses y años
            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    diaMes = 31;
                    break;
                case 2:
                    nombreMes = "Febrero";
                    diaMes = 29;
                    break;
                case 3:
                    nombreMes = "Marzo";
                    diaMes = 31;
                    break;
                case 4:
                    nombreMes = "Abril";
                    diaMes = 30;
                    break;
                case 5:
                    nombreMes = "Mayo";
                    diaMes = 31;
                    break;
                case 6:
                    nombreMes = "Junio";
                    diaMes = 30;
                    break;
                case 7:
                    nombreMes = "Julio";
                    diaMes = 31;
                    break;
                case 8:
                    nombreMes = "Agosto";
                    diaMes = 31;
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    diaMes = 30;
                    break;
                case 10:
                    nombreMes = "Octubre";
                    diaMes = 31;
                    break;
                case 11:
                    nombreMes = "Noviembre";
                    diaMes = 30;
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    diaMes = 31;
                    break;
                default:
                    System.out.println("\nEl mes introducido no es válido.");
            }

            // Validar si el día es correcto según el mes y el año
            if (dia > 30 && diaMes == 31) { 
                System.out.println("\nEl mes " + nombreMes + " no tiene el día " + dia + ". Inténtalo de nuevo. ");
                continue;                
            } 
            else if (dia > 29 && mes == 2) {
                System.out.println("\nEl mes " + nombreMes + " no tiene el día " + dia + ". Inténtalo de nuevo. ");
                continue;
            }
            break;
        }

        System.out.println("");

/* 3º WHILE PARA LOS ANOS */
        while (true) { 
            // Introducir un año que no sea 0
            System.out.print("Introduzca un año: ");
            anho = scanner.nextInt();
            

            // Si el año es 0, obligar que el usuario vuelva a intentar.
            if (anho == 0) { 
                System.out.println("\nNo existe el año " + anho + ". Inténtalo de nuevo.");
                continue;
            }

            // Para convertir año negativo en año antes de Cristo
            else if (anho < 0) { 
                int anhoPositivo = Math.abs(anho);
                anho01 = anhoPositivo + " a.C.";
            }
            else {
                anho01 = anho + "d.C.";
            }

            // Año bisiesto [ej. boolean anhoBisiesto = (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);]
            if (mes == 2) {
                if (dia > 28 && ((anho % 4 != 0 && anho % 100 != 0) || (anho % 400 == 0))) {
                    diaMes = 28;
                    System.out.println("\nEl año " + anho01 + " no es bisiesto. El mes " + nombreMes + " solamente tiene " + diaMes + " días. \nInténtalo de nuevo con otro año.");
                    continue;
                }
            }
            break;
        }

        // Mostrar el mensaje válida
        System.out.println("\nLa fecha introducida (" + dia + " de " + nombreMes + " del año " + anho01 + ") es válida.");
    }
}