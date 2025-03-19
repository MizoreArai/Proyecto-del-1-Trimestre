
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		// Pedirle nombre al usuario
		pedirNombre();
		// Leer el nombre y almacenarlo
		String nombreUsuario = leerNombre();
		// Escribir el saludo por pantalla
		escribirSaludo(nombreUsuario);
	}

	private static void escribirSaludo(String nombreUsuario) {
		System.out.println("¡Hola " + nombreUsuario + "!");
	}

	private static String leerNombre() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: ");
	}
}