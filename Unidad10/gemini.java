// librerias importadas
import java.util.Scanner;
import java.util.InputMismatchException;
public class gemini {
    private static Scanner sc = new Scanner(System.in);
    // a) Leer un número entero
    // se comprueba la validez de la entrada y se muestran mensajes de error si es necesario.
    public static int leerInt() {
        int num = 0; // variable para almacenar el número leído
        boolean valido = false; // bbandera para indicar si la entrada es válida

        // bucle para repetir la lectura hasta que se introduzca un valor válido
        while (!valido) {
            try {
                // se intenta leer un número entero del usuario
                num = sc.nextInt();
                valido = true; // se marca la entrada como válida
            } catch (InputMismatchException e) {
                // se muestra un mensaje de error si la entrada no es un número entero
                System.err.println("Error: Debe introducir un número entero.");
                sc.nextLine(); // se descarta la entrada no válida
            }
        }

        // Se devuelve el número leído
        return num;
    }

    // b) Leer un número entero solo positivo
    // Este método lee un número entero positivo del usuario y lo devuelve.
    // Se comprueba la validez de la entrada y se muestran mensajes de error si es necesario.
    public static int leerIntPos() {
        int num = 0; // Variable para almacenar el número leído
        boolean valido = false; // Bandera para indicar si la entrada es válida

        // Bucle para repetir la lectura hasta que se introduzca un valor válido
        while (!valido) {
            // Se lee un número entero usando el método leerInt()
            num = leerInt();

            // Se comprueba si el número es positivo
            if (num <= 0) {
                // Se muestra un mensaje de error si el número no es positivo
                System.err.println("Error: Debe introducir un número entero positivo.");
            } else {
                // Se marca la entrada como válida
                valido = true;
            }
        }

        // Se devuelve el número leído
        return num;
    }

    // c) Leer un número entero en un rango determinado
    // Este método lee un número entero en un rango determinado del usuario y lo devuelve.
    // Se comprueba la validez de la entrada y se muestran mensajes de error si es necesario.
    public static int leerIntRango(int min, int max) {
        int num = 0; // Variable para almacenar el número leído
        boolean valido = false; // Bandera para indicar si la entrada es válida

        // Bucle para repetir la lectura hasta que se introduzca un valor válido
        while (!valido) {
            // Se lee un número entero usando el método leerInt()
            num = leerInt();

            // Se comprueba si el número está en el rango especificado
            if (num < min || num > max) {
                // Se muestra un mensaje de error si el número no está en el rango
                System.err.printf("Error: Debe introducir un número entero entre %d y %d.\n", min, max);
            } else {
                // Se marca la entrada como válida
                valido = true;
            }
        }

        // Se devuelve el número leído
        return num;
    }

    // d) Leer un número real
    // Este método lee un número real del usuario y lo devuelve.
    // Se comprueba la validez de la entrada y se muestran mensajes de error si es necesario.
    public static double leerDou() {
        double num = 0.0; // Variable para almacenar el número leído
        boolean valido = false; // Bandera para indicar si la entrada es válida

        // Bucle para repetir la lectura hasta que se introduzca un valor válido
        while (!valido) {
            try {
                // Se intenta leer un número real del usuario
                num = sc.nextDouble();
                valido = true; // Se marca la entrada como válida
            } catch (InputMismatchException e) {
                // Se muestra un mensaje de error si la entrada no es un número real
                System.err.println("Error: Debe introducir un número real.");
                sc.nextLine(); // Se descarta la entrada no válida
            }
        }

        // Se devuelve el número leído
        return num;
    }

    // e) Leer un número real en un rango determinado
    // Este método lee un número real en un rango determinado del usuario y lo devuelve.
    // Se comprueba la validez de la entrada y se muestran mensajes de error si es necesario.
    public static double leerDouRango(double min, double max) {
        double num = 0.0; // Variable para almacenar el número leído
        boolean valido = false; // Bandera para indicar si la entrada es válida

        // Bucle para repetir la lectura hasta que se introduzca un valor válido
        while (!valido) {
            // Se lee un número real usando el método leerDou()
            num = leerDou();

            // Se comprueba si el número está en el rango especificado
            if (num < min || num > max) {
                // Se muestra un mensaje de error si el número no está en el rango
                System.err.printf("Error: Debe introducir un número real entre %f y %f.\n", min, max);
            } else {
                // Se marca la entrada como válida
                valido = true;
            }
        }

        // Se devuelve el número leído
        return num;
    }
}