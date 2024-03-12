// Carlos C de DAW1 ^^ //
// importacion librerias
import java.io.*;
import java.util.*;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables
        String usuario;
        String contrasena;
        String userpass;
        String off;
        boolean bucle = false;
        File file = new File("contrasena.txt");
        
        while (!bucle) {
            System.out.println("Introduzca su username: ");
            usuario = sc.nextLine();
            System.out.println("Introduzca la contraseña: ");
            contrasena = sc.nextLine();
            // se juntan el usuario y la contraseña en una unica variable para añadirlo al fichero sin problemas
            userpass = "\n" + usuario + ":" + contrasena;
            try {
                // se comprueba que el archivo exista, si no se crea
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter entrada = new FileWriter("contrasena.txt", true);
                // se escribe el usuario y su contraseña en el archivo
                entrada.write(userpass);
                // cierro el archivo
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.print("Cerrar programa? S/N");
                off = sc.nextLine();
                if ("S".equalsIgnoreCase(off)) {
                    bucle = true;
                }
            }
            sc.close();
    
        }

    }
}