// Carlos C de DAW1 ^^ //
// importacion librerias
import java.io.*;
import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
        String texto;
        File file = new File("texto.txt");
        try {
            // se comprueba que el archivo exista, si no se crea
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter entrada = new FileWriter("texto.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
