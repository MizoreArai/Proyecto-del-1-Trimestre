package Examen1AF.com.liceolapaz.des.AF;

import java.util.Random;
import java.util.Scanner; // Librería para leer datos del teclado

// Crear un proyecto llamado Examen1*** (donde *** son vuestras iniciales)
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int puntosExtras = 0;
        int edad = 0;
        String posicion = "Null";
        int disparo = 0; 
        int regate = 0;
        int pase = 0;
        int velocidad = 0;
        int defensa = 0;
        int porteria = 0;
        int media = 0;

        // Al comenzar, el programa deberá escribir el siguiente menú principal
        while (true) { 
            System.out.println("\nCREACIÓN JUGADOR\r\n" +
                                "1. Edad\r\n" +
                                "2. Posición\r\n" +
                                "3. Habilidades\r\n" +
                                "4. Puntos extras\r\n" +
                                "5. Mostrar jugador\r\n" +
                                "0. Salir\r\n" +
                                "\nEscoja una opción:");                  
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                // Salir del loop
                System.out.println("\nEl juego se ha terminado. ¡Gracias por su visita!");
                break;
            }


            switch (opcion) {
                case 1:
                    // El programa elegirá de forma aleatoria una edad entre 16 y 35 y la almacenará para mostrarla posteriormente.
                    edad = random.nextInt(35 - 16 + 1) + 16;

                    // Una vez hecho esto, volverá a mostrarse el menú principal
                    break;
                
                case 2:
                    /*El programa elegirá de forma aleatoria una de las posiciones válidas (Portero, Defensa, Mediocampista y Delantero) 
                    y la almacenará para mostrarla posteriormente.*/
                    String[] Posiciones = {"Portero", "Defensa", "Mediocampista", "Delantero"};
                    posicion = Posiciones[random.nextInt(Posiciones.length)];                    

                    // Una vez hecho esto, volverá a mostrarse el menú principal.
                    break;

                case 3:
                    /*El programa elegirá de forma aleatoria un valor entre 1 y 99 puntos para cada una de las habilidades básicas 
                    de nuestro jugador (Disparo, Regate, Pase, Velocidad, Defensa y Portería) y las almacenará para mostrarlas posteriormente.*/
                    disparo = random.nextInt(99 - 1 + 1) + 1; 
                    regate = random.nextInt(99 - 1 + 1) + 1;
                    pase = random.nextInt(99 - 1 + 1) + 1;
                    velocidad = random.nextInt(99 - 1 + 1) + 1;
                    defensa = random.nextInt(99 - 1 + 1) + 1;
                    porteria = random.nextInt(99 - 1 + 1) + 1;

                    // También reiniciará los puntos extras en caso de que estos no fuesen 50.
                    if (puntosExtras!= 50) {
                        puntosExtras = 50;
                    }

                    // Una vez hecho esto, volverá a mostrarse el menú principal.
                    break;

                case 4:
                     
                    // Si no tenemos puntos extra disponibles nos saldrá un mensaje de error advirtiéndonos de ello y volverá a mostrar el menú principal.
                    if (puntosExtras == 0) {
                        System.out.println("\nNo tienes puntos extras disponibles.");
                        break;
                    }

                    /*En el caso de que sí tengamos puntos extras, el programa primero nos preguntará a qué habilidad queremos asignarle puntos extras 
                    y luego nos preguntará cuántos puntos extras le queremos asignar.
                    Podremos asignarle cualquier cantidad a una habilidad siempre que no nos pasemos de la cantidad de puntos extras que tenemos en ese momento disponibles 
                    y siempre que al sumarle los puntos extras el valor de esa habilidad no supere los 99 puntos.*/
                    else if ( puntosExtras!=0){
                        System.out.println("\nTienes " + puntosExtras + " puntos extras.\r\n" + 
                                            "\n¿A qué habilidad deseas añadir puntos extras? \r\n" +
                                            "1. Disparo \r\n" +
                                            "2. Regate \r\n" + 
                                            "3. Pase \r\n" + 
                                            "4. Velocidad \r\n" + 
                                            "5. Defensa \r\n" + 
                                            "6. Portería \r\n" +
                                            "\nEscoja una opción:");
                        int opcion01 = scanner.nextInt();

                        switch (opcion01) { 
                            case 1:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir al disparo?");
                                int puntosDisparo = scanner.nextInt();
                                    
                                if (puntosDisparo + disparo <= 99 && puntosExtras - puntosDisparo >= 0) { 
                                    disparo += puntosDisparo;
                                    puntosExtras -= puntosDisparo;
                                    System.out.println("\nDisparo añadido con éxito! \n");
                                    break;
                                } 
                                else {
                                    /*Si no tenemos suficientes puntos extras o si al sumarle los puntos extras a la habilidad dicha habilidad sumase más de 99 puntos, 
                                    el programa nos mostrará un error y no hará dicha asignación de puntos. 
                                    Una vez hecha la asignación de puntos (o después de haber mostrado el error correspondiente), el programa volverá a mostrar el menú principal.*/ 
                                    System.out.println("\nNo se puede añadir más puntos extras al disparo. \n");
                                    break;
                                }
                                    
                            case 2:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir al regate?");
                                int puntosRegate = scanner.nextInt();
                                        
                                if (puntosRegate + regate <= 99 &&  puntosExtras - puntosRegate >= 0) {
                                    regate += puntosRegate;
                                    puntosExtras -= puntosRegate;
                                    System.out.println("\nRegate añadido con éxito! \n");
                                    break;
                                } 
                                else {
                                    System.out.println("\nNo se puede añadir más puntos extras al regate. \n");
                                    break;
                                }
                                    
                            case 3:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir al pase?");
                                int puntosPase = scanner.nextInt();
                                        
                                if (puntosPase + pase <= 99 &&  puntosExtras - puntosPase >= 0) {
                                    pase += puntosPase;
                                    puntosExtras -= puntosPase;
                                    System.out.println("\nPase añadido con éxito! \n");
                                    break;
                                } 
                                else {
                                    System.out.println("\nNo se puede añadir más puntos extras al pase. \n");
                                    break;
                                }
                                    
                            case 4:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir a la velocidad?");
                                int puntosVelocidad = scanner.nextInt();
                                    
                                if (puntosVelocidad + velocidad <= 99 &&  puntosExtras - puntosVelocidad >= 0) {
                                    velocidad += puntosVelocidad;
                                    puntosExtras -= puntosVelocidad;
                                    System.out.println("\nVelocidad añadida con éxito! \n");
                                    break;
                                } 
                                else {
                                    System.out.println("\nNo se puede añadir más puntos extras a la velocidad. \n");
                                    break;
                                }
                                    
                            case 5:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir a la defensa?");
                                int puntosDefensa = scanner.nextInt();
                                    
                                if (puntosDefensa + defensa <= 99 &&  puntosExtras - puntosDefensa >= 0) {
                                    defensa += puntosDefensa;
                                    puntosExtras -= puntosDefensa;
                                    System.out.println("\nDefensa añadida con éxito! \n");
                                    break;
                                } 
                                else {
                                    System.out.println("\nNo se puede añadir más puntos extras a la defensa. \n");
                                    break;
                                }
                                    
                            case 6:
                                System.out.println("\n¿Cuántos puntos extras deseas añadir a la portería?");
                                int puntosPorteria = scanner.nextInt();
                                    
                                if (puntosPorteria + porteria <= 99 &&  puntosExtras - puntosPorteria >= 0) {
                                    porteria += puntosPorteria;
                                    puntosExtras -= puntosPorteria;
                                    System.out.println("\nPortería añadida con éxito! \n");
                                    break;
                                } 
                                else {
                                    System.out.println("\nNo se puede añadir más puntos extras a la portería. \n");
                                    break;
                                }
                                    
                            default:
                                System.out.println("\nOpción no válida. \n¡Inténtalo de nuevo! \n");
                                break;
                        }
                    }
                    break;
                
                case 5:
                    // el programa mostrará el estado actual del jugador y luego mostrará otra vez el menú principal. 
                    media = (disparo + regate + pase + velocidad + defensa + porteria)/6;
                    System.out.println("\nJUGADOR: \r\n" + 
                                        "Edad: " + edad + "\n" +
                                        "Posición: " + posicion + "\n" +
                                        "Disparo: " + disparo + "\r\n" +
                                        "Regate: " + regate + "\r\n" +
                                        "Pase: " + pase + "\r\n" +
                                        "Velocidad: " + velocidad + "\r\n" +
                                        "Defensa: " + defensa + "\r\n" +
                                        "Portería: " + porteria + "\r\n" +
                                        // Además de mostrar cada una de sus habilidades, también deberá mostrar la media global de dichas habilidades(sin decimales).
                                        "Media Habilidades: " + media);
                                        
                    break;

                default:
                    System.out.println("\nEl valor introducido no es válido. \n¡Inténtalo de nuevo! \n");
                    break;

            }

        }
        
    }

}
