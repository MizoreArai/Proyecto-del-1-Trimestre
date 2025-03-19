import java.util.Random;
import java.util.Scanner;

public class papelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones permitidas en el juego
        String[] opciones = {"piedra", "papel", "tijeras", "lagarto", "spock"};

        while (true) {
            // Mostrar menú principal
            System.out.println("\nPIEDRA PAPEL TIJERAS LAGARTO SPOCK \n1. Jugar \n0. Salir \nEscoja una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            if (opcion == 0) {
                System.out.println("¡Gracias por jugar! Hasta pronto.");
                break;
            } else if (opcion == 1) {
                // Jugada del ordenador aleatoria
                String jugadaOrdenador = opciones[random.nextInt(opciones.length)];

                // Pedir jugada del usuario
                System.out.print("Escriba su jugada (piedra, papel, tijeras, lagarto, spock): ");
                String jugadaUsuario = scanner.nextLine().toLowerCase();

                // Verificar si la jugada del usuario es válida
                if (!esJugadaValida(jugadaUsuario, opciones)) {
                    System.out.println("Jugada no permitida. El ordenador había jugado " + jugadaOrdenador);
                    continue;
                }

                // Determinar el resultado de la partida
                String resultado = determinarResultado(jugadaUsuario, jugadaOrdenador);

                // Mostrar el resultado
                System.out.println(resultado + " El ordenador había jugado " + jugadaOrdenador);
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Función para verificar si la jugada es válida
    private static boolean esJugadaValida(String jugada, String[] opciones) {
        for (String opcion : opciones) {
            if (opcion.equals(jugada)) {
                return true;
            }
        }
        return false;
    }

    // Función para determinar el resultado del juego
    private static String determinarResultado(String jugador, String ordenador) {
        if (jugador.equals(ordenador)) {
            return "Empate.";
        }

        switch (jugador) {
            case "piedra":
                return (ordenador.equals("tijeras") || ordenador.equals("lagarto")) ? "Victoria." : "Derrota.";
            case "papel":
                return (ordenador.equals("piedra") || ordenador.equals("spock")) ? "Victoria." : "Derrota.";
            case "tijeras":
                return (ordenador.equals("papel") || ordenador.equals("lagarto")) ? "Victoria." : "Derrota.";
            case "lagarto":
                return (ordenador.equals("spock") || ordenador.equals("papel")) ? "Victoria." : "Derrota.";
            case "spock":
                return (ordenador.equals("tijeras") || ordenador.equals("piedra")) ? "Victoria." : "Derrota.";
            default:
                return "Jugada no válida.";
        }
    }
}

