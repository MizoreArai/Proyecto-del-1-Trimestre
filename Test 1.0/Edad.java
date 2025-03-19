import java.util.Scanner;

public class Edad {
    //Constante con mayúsculas 
    //(final: no se puede cambiar el valor)
    private static final int ANHO_ACTUAL = 2024;
    
    public static void main(String[] args) {
        //Preguntar año de nacimiento
        preguntarAnhoNacimiento();
        //Leer el año de nacimiento y guardarlo
        int datoNacimiento = leer();
        //Escribir mensaje en función del año de nacimiwnto
        escribirMensaje(datoNacimiento);
    }
    private static void escribirMensaje(int datoNacimiento){
        if (datoNacimiento > ANHO_ACTUAL){
            System.out.println("No puedes haber nacido.");
        } else if (datoNacimiento < ANHO_ACTUAL - 150){
            System.out.println("Tendrías que estar muerto.");
        } else if (ANHO_ACTUAL - datoNacimiento >= 18){
            System.out.println("Puedes pasar.");
        } else if (ANHO_ACTUAL - datoNacimiento < 18){
            System.out.println("No puedes pasar.");
        } 
    }
    private static int leer(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    private static void preguntarAnhoNacimiento(){
        System.out.println("Introduce tu año de nacimiento: ");
    }
}
