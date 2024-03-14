// Carlos C de DAW1 ^^ //
// importacion librerias
import java.io.*;
import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        boolean bucle = false;
        File file = new File("texto.txt");
        while (!bucle) {
            System.out.println("Escribe lo que quieres guardar en el archivo: ");
            texto = sc.nextLine();
            texto = ("\n" + texto);
            try {
                // se comprueba que el archivo exista, si no se crea
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter entrada = new FileWriter("texto.txt", true);
                entrada.write(texto);
                // cierro el archivo
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
