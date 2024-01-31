//Tres en raya by CC v1
import java.util.Scanner;
import java.util.Random;
public class actividad2 {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    //Mensaje de bienvenida
    System.out.println("Bienvenido al 3 en raya. Jugarás contra una IA "+ 
    "que es imposible ganar. ¡Buena suerte! " + "A continuación te muestro las coordenadas "+ 
    "del tablero.\n");
    //Elección IA y Jugador
    int player;
    int ia;
    //control de repeticion de casillas
    boolean [] casillas = new boolean [10];
    //Las posiciones serán variables
    String p1 = "1";
    String p2 = "2";
    String p3 = "3";
    String p4 = "4";
    String p5 = "5";
    String p6 = "6";
    String p7 = "7";
    String p8 = "8";
    String p9 = "9";
        //Bucle del juego
        for (int count = 0; count <= 10; count++) {
        System.out.println( p1 + " | " + p2 + " | " + p3);
        System.out.println("-   -   -");
        System.out.println( p4 + " | " + p5 + " | " + p6);
        System.out.println("-   -   -");
        System.out.println( p7 + " | " + p8 + " | " + p9);
        //Comprobación de victoria del jugador o IA
        if ((p1 == "X" && p2 == "X" && p3 == "X") || (p4 == "X" && p5 == "X" && p6 == "X") || (p7 == "X" && p8 == "X" && p9 == "X") ||
        (p1 == "X" && p5 == "X" && p9 == "X") || (p3 == "X" && p5 == "X" && p7 == "X") || (p1 == "X" && p4 == "X" && p7 == "X") || 
        (p2 == "X" && p5 == "X" && p8 == "X") || (p3 == "X" && p6 == "X" && p9 == "X")) {
            System.out.print("¡Felicidades! ¡Has ganado!");
            break;
        } else if ((p1 == "O" && p2 == "O" && p3 == "O") || (p4 == "O" && p5 == "O" && p6 == "O") || (p7 == "O" && p8 == "O" && p9 == "O") ||
            (p1 == "O" && p5 == "O" && p9 == "O") || (p3 == "O" && p5 == "O" && p7 == "O") || (p1 == "O" && p4 == "O" && p7 == "O") || 
            (p2 == "O" && p5 == "O" && p8 == "O") || (p3 == "O" && p6 == "O" && p9 == "O")) {
                System.out.print("¡Has perdido!");
                break;
        }
        System.out.print("\nElije una coordenada: ");
            //Elección de casilla del jugador
            player = sc.nextInt();
            //Comprobar que el usuario escribe del 1 al 9
            while (player <= 0 || player > 9) {
                System.out.print("Has introducido una coordenada no válida. Introduce una válida:\n");
                player = sc.nextInt();
            }
            //Comprobación de que la casilla no esté ocupada por parte del jugador
            while (casillas[player] == true) {
                System.out.print("Coordenada incorrecta, introduzca otra:\n");
                player = sc.nextInt();
            }
            casillas[player] = true;
            //Elección de casilla de la IA
            ia = rd.nextInt(9) + 1;
            //Comprobación de que la casilla no haya sido elegida por el jugador ni esté ya en uso
            while (player == ia || casillas[ia] == true) {
                ia = rd.nextInt(9) + 1;
            }
            casillas[ia] = true;
            //Bucle donde se evaluará la casilla del jugador
            switch (player) {
                case 1:
                    p1 = "X";
                    break;
                case 2:
                    p2 = "X";
                    break;
                case 3:
                    p3 = "X";
                    break;
                case 4:
                    p4 = "X";
                    break;
                case 5:
                    p5 = "X";
                    break;
                case 6:
                    p6 = "X";
                    break;
                case 7:
                    p7 = "X";
                    break;
                case 8:
                    p8 = "X";
                    break;
                case 9:
                    p9 = "X";
                    break;
                default:
                    System.out.print("Has elegido una opción no válida, prueba de nuevo: \n");
            } 
            //Bucle donde se evaluará la casilla de la IA
            switch (ia) {
                case 1:
                    p1 = "O";
                    break;
                case 2:
                    p2 = "O";
                    break;
                case 3:
                    p3 = "O";
                    break;
                case 4:
                    p4 = "O";
                    break;
                case 5:
                    p5 = "O";
                    break;
                case 6:
                    p6 = "O";
                    break;
                case 7:
                    p7 = "O";
                    break;
                case 8:
                    p8 = "O";
                    break;
                case 9:
                    p9 = "O";
                    break;
            }
        }
        sc.close();
    }
}