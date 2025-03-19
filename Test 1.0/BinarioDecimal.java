import java.util.Scanner;

public class binarioDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables para la calculadora
        while (true) { 

            // Pedir al usuario para que elija una opción
            System.out.println("CONVERSOR BINARIO: \n1. Convertir de decimal a binario \n2. Convertir de binario a decimal \n0. Salir \n\nElija una opción: \n");
            int opcion = scanner.nextInt();
            
            // Validar que la opción no sea válida
            if (opcion < 0 || opcion > 2) {
                System.out.println("\nLa opción introducida no es válida. ¡Inténtalo de nuevo!\n");
                continue;
            }
            
            // Validar que la opción sea válida
            switch (opcion) {
                // Salir del loop
                case 0:
                    System.out.println("\nPrograma terminado. Gracias por su visita! \n");    
                break;

                // Convertir de decimal a binario
                case 1:
                    System.out.print("\nIntroduzca un número decimal: ");
                    int numD = scanner.nextInt(); // Con String, utiliza nextLine()
                    
                    // Calcular el número de decimal a binario
                    System.out.println("\nEl número en binario es: " + decABin(numD) + "\n");
                continue;

                // Convertir de binario a decimal;
                case 2:
                    System.out.print("\nIntroduzca un número binario: ");
                    int numB = scanner.nextInt();
                    
                    // Calcular el número de binario a decimal
                    System.out.println("\nEl número en decimal es: " + binADec(numB) + "\n");
                continue;
                
                //default:
                    //throw new AssertionError();
            }
            break;
            
        }
    }

    private  static int binADec(int numB) {
        int decimal = 0;
        int exponente = 0;
        while (numB != 0) {
            int i = numB % 10;
            double d10 = Math.pow(2, exponente);
            decimal += i * d10;
            numB /= 10;
            exponente++;
        }
        return decimal;
    }

    private static int decABin(int numD){
        int binario = 0;
        int exponente = 0;
        while (numD != 0) {
            int i = numD % 2;
            double d10 = Math.pow(10, exponente);
            binario += i * d10;
            numD /= 2;
            exponente++;
        }
        return binario;
    }
}



/*StringBuilder binario = new StringBuilder();
while (numD > 0) {
        binario.insert(0, (int) numD % 2);
    numD /= 2;
}
System.out.println("\nEl número en binario es: " + binario);
break;

---
                    
Scanner input = new Scanner( System.in );
System.out.println("Enter a binary number: ");

int  binarynum =input.nextInt();
int binary=binarynum;

int decimal = 0;
int power = 0;

while(true){
    if(binary == 0){
        break;
    } else {
        int temp = binary%10;
        decimal += temp*Math.pow(2, power);
        binary = binary/10;
        power++;

    }
}
System.out.println("Binary="+binarynum+" Decimal="+decimal);
*/
