import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        //Pedir un número
        pedirNumero();
        //Leer número y guardarlo
        int numero = leerNumero();
        //Comprobar si es par o impar
       String mensaje = comprobarNumero(numero);
        //Escribir mensaje
        escribirMensaje(mensaje);
    }

    private static void escribirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    private static String comprobarNumero(int numero){
        String texto;
        texto = (numero % 2 == 0)? "El número introducido es par."
        : "El número introducido es impar.";
        return texto;
    }
    
    private static int leerNumero(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    
    }

    private static void pedirNumero(){
        System.out.println("Escriba un número entero:");

	}
}
