// Carlos C de DAW1 ^^
// librerias importadas
import java.util.InputMismatchException;
import java.util.Scanner;
public class InOK {
    private static Scanner sc = new Scanner(System.in);
    // apartado a
    public static int leeInt () {
        int numero = 0;
        boolean rompeBucle = false;
        while (!rompeBucle) {
            try {
                numero = sc.nextInt();
                rompeBucle = true;
            // se coge el error en caso que se meta algo que no sea un numero entero
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes introducir un numero entero.");
                sc.nextLine();
            }
        }
        return numero;
    }
    // apartado b
    public static int leerIntPos() {
        int numero = 0;
        boolean rompeBucle = false;

        while(!rompeBucle) {
            numero = leeInt();
            if (numero <= 0) {
                System.out.println(("ERROR: Debes introducir un numero entero positivo"));
            } else {
                rompeBucle = true;
            }
        }
    return numero;
    }
    // apartado c
    public static int leerIntRango(int min, int max) {
        int numero = 0;
        boolean rompeBucle = false;
        while (!rompeBucle) {
            numero = leeInt();
            if (numero < min || numero > max) {
                System.out.printf("ERROR: Debes introducir un numero entero entre %d y %d.\n", min, max);
            } else {
                rompeBucle = true;
            }
        }
    return numero;
    }
    // apartado d
    public static double leerDou() {
        double numero = 0.0;
        boolean rompeBucle = false;
        while (!rompeBucle) {
            try {
                numero = sc.nextDouble();
                rompeBucle = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un numero real");
                sc.nextLine();
            }
        }
    return numero;
    }
    // apartado e
    public static double leerDouRange(double min, double max) {
        double numero = 0.0;
        boolean rompeBucle = false;
        while (!rompeBucle) {
            numero = leerDou();
            if (numero < min || numero > max) {
                System.out.printf("ERROR: Debes introducir un numero real entre %f y %f.\n", min, max);
            } else {
                rompeBucle = true;
            }
        }
    return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}