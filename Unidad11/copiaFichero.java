// Carlos C de DAW1 ^^ //
// import librerias
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class copiaFichero {
    public static void main(String[] args) {
        int caracter;
        try {
            FileReader in = new FileReader("fuente.txt");
            // new FileWriter ("archivo.txt", true) para abrir el modo append
            // ESTE MODO NO SOBREESCRIBE EL ARCHIVO SI YA TIENE INFORMACION, LA AÑADE
            FileWriter out = new FileWriter("destino.txt");
            while ( (caracter = in.read()) != -1 ) {
                out.write(caracter);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e1) {
            System.err.println("ERROR: No se encuentra el fichero");
        } catch (IOException e2) {
            System.err.println("Error leyendo/escribiendo fichero");
        }
    }
}