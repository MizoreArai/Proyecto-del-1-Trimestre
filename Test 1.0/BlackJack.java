import java.util.Random;
import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true){
            int min = 1;
            int max = 11;
            int random01 = 0;
            int random02 = 0;
            int random03 = 0;
            int user = 0;
            int total = 0;
            int croupier = 0;
            int counterAI = 1;
            int counter = 2;

            System.out.println("BLACKJACK\r\n" +
                                "1. Modo fácil\r\n" +
                                "2. Modo normal\r\n" +
                                "0. Salir\r\n" +
                                "Escoja una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                    // Salir del loop
                    System.out.println("\nEl juego se ha terminado. ¡Gracias por su visita!");
                    break;
            }

            switch (opcion) {
                case 1:
                    // Modo fácil
                    // IA: Generarar números aleatorios entre el 1 y el 11
                    System.out.println("");

                    do { 
                        random01 = random.nextInt(max - min + 1) + min;
                        System.out.println("La " + counterAI + "º carta de la AI es: " + random01 + ".");
                        counterAI++;
                        int temporal = random01;
                        random01 = 0;
                        croupier = croupier + temporal;
                    } while (croupier < 15);

                    System.out.println("El puntaje de la IA es: " + croupier + ". \n");

                    // Usuario: Generarar números aleatorios entre el 1 y el 11
                    random02 = random.nextInt(max - min + 1) + min;
                    random03 = random.nextInt(max - min + 1) + min;
                    total = random02 + random03;
                    System.out.println("Tus cartas son: " + random02 + ", " + random03 + ".");

                    //Sumar los puntos y comprobar si se pasa de 21
                    System.out.println("Tu puntaje es: " + total + ". \n");

                    if (total > 21) {
                        if (croupier > 21) {
                            if (counter < counterAI) {
                                System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter > counterAI) {
                                System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter == counterAI) {
                                System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            
                        } 
                        else if (croupier <= 21) {
                            System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                        }
                    } 
                    else if (total == 21) {
                        if ((croupier > 21)||(croupier < 21)) {
                            System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                        } 
                        else if (croupier == 21) {
                            if (counter < counterAI) {
                                System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter > counterAI) {
                                System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter == counterAI) {
                                System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }                        }
                    }
                    else if ((total < 21)&&(croupier > 21)) {
                        System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                    }
                    else {
                        while (true) { 
                            // Pedir carta
                            System.out.println("\n¿Quieres pedir más carta?\r\n" + 
                                                "1. Sí\r\n" +
                                                "2. No\r\n" + 
                                                "Escoja una opción:");
                            int carta = scanner.nextInt();
                            
                            if (carta == 1) {
                                counter++;
                                user = random.nextInt(max - min + 1) + min;
                                total = total + user;
                                System.out.println("Tu nueva carta es: " + user + ".");
                                System.out.println("Tu puntaje es: " + total + ". \n");
                                
                                if (total > 21) {
                                    if (croupier > 21) {
                                        if (counter < counterAI) {
                                            System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter > counterAI) {
                                            System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter == counterAI) {
                                            System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                    } else if (croupier <= 21) {
                                        System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                    }
                                    break;
                                } 
                                else if (total == 21) {
                                    if ((croupier > 21)||(croupier < 21)) {
                                        System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                    } else if (croupier == 21) {
                                        if (counter < counterAI) {
                                            System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter > counterAI) {
                                            System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter == counterAI) {
                                            System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                    }
                                    break;
                                } 
                                else {
                                }
                            } 
                            else if (carta == 2) {
                                System.out.println("Tu puntaje es: " + total + ". \n");
                                
                                if (total > croupier) {
                                    System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                    break;
                                }
                                else if (total == croupier) {
                                    if (counter < counterAI) {
                                        System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    else if (counter > counterAI) {
                                        System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    else if (counter == counterAI) {
                                        System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    break;
                                }
                                else if (total < croupier) {
                                    if (croupier <= 21) {
                                        System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                        break;
                                    }
                                    else if (croupier > 21) {
                                        System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                        break;
                                    }
                                }
                                break;
                            }
                            else {
                                System.out.println("La opción introducida no es válida. \nInténtalo otra vez. \n");
                            }
                        }
                    }
                    break;
                case 2:
                    //Modo normal
                    //Generarar números aleatorios entre el 1 y el 13

                    System.out.println("");

                    do { 
                        random01 = random.nextInt(max - min + 1) + min;
                        counterAI++;
                        int temporal = random01;
                        random01 = 0;
                        croupier = croupier + temporal;
                    } while (croupier < 15);

                    // Usuario: Generarar números aleatorios entre el 1 y el 11
                    random02 = random.nextInt(max - min + 1) + min;
                    random03 = random.nextInt(max - min + 1) + min;
                    total = random02 + random03;
                    System.out.println("Tu carta es: " + random02 + ", " + random03 + ".");

                    //Sumar los puntos y comprobar si se pasa de 21
                    System.out.println("Tu puntaje es: " + total + ". \n");

                    if (total > 21) {
                        if (croupier > 21) {
                            if (counter < counterAI) {
                                System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter > counterAI) {
                                System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter == counterAI) {
                                System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }                        } else if (croupier <= 21) {
                            System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                        }
                    } 
                    else if (total == 21) {
                        if ((croupier > 21)||(croupier < 21)) {
                            System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                        } else if (croupier == 21) {
                            if (counter < counterAI) {
                                System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter > counterAI) {
                                System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                            else if (counter == counterAI) {
                                System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                            }
                        }
                    }
                    else {
                        while (true) { 
                            // Pedir carta
                            System.out.println("\n¿Quieres pedir más carta?\r\n" + 
                                                "1. Sí\r\n" +
                                                "2. No\r\n" + 
                                                "Escoja una opción:");
                            int carta = scanner.nextInt();
                            
                            if (carta == 1) {
                                counter++;
                                user = random.nextInt(max - min + 1) + min;
                                total = total + user;
                                System.out.println("Tu nueva carta es: " + user + ".");
                                System.out.println("Tu puntaje es: " + total + ". \n");
                                
                                if (total > 21) {
                                    if (croupier > 21) {
                                        if (counter < counterAI) {
                                            System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter > counterAI) {
                                            System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter == counterAI) {
                                            System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }                                    } else if (croupier <= 21) {
                                        System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ".");
                                    }
                                    break;
                                } else if (total == 21) {
                                    if ((croupier > 21)||(croupier < 21)) {
                                        System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ".");
                                    } else if (croupier == 21) {
                                        if (counter < counterAI) {
                                            System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter > counterAI) {
                                            System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                        else if (counter == counterAI) {
                                            System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                        }
                                    }
                                    break;
                                } else {
                                }
                            } 
                            else if (carta == 2) {
                                System.out.println("Tu puntaje es: " + total + ". \n");
                                
                                if (total > croupier) {
                                    System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                    break;
                                }
                                else if (total == croupier) {
                                    if (counter < counterAI) {
                                        System.out.println("¡Perdiste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    else if (counter > counterAI) {
                                        System.out.println("¡Ganaste! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    else if (counter == counterAI) {
                                        System.out.println("¡Empate! \nTu puntaje y intentos son: " + total + "," + counter + ". \nLa IA tiene un puntaje y intentos de: " + croupier + "," + counterAI + ". \n");
                                    }
                                    break;
                                }
                                else if (total < croupier) {
                                    if (croupier <= 21) {
                                        System.out.println("¡Perdiste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                        break;
                                    }
                                    else if (croupier > 21) {
                                        System.out.println("¡Ganaste! \nTu puntaje es: " + total + ". \nLa IA tiene un puntaje de: " + croupier + ". \n");
                                        break;
                                    }
                                }
                                break;
                            }
                            else {
                                System.out.println("La opción introducida no es válida. \nInténtalo otra vez. \n");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("La opción introducida no es válida. Inténtalo otra vez.\n");
                    break;
            }
        }
    }
}
