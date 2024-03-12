// Carlos C de DAW1 ^^ //
// import librerias
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class copiaFicheroLinea {
    public static void main(String[] args) {
        String linea;
        try {
            FileReader in = new FileReader("fuente.txt");
            // se usa BufferedReader para poder leer lineas y no caracteres
            BufferedReader entrada = new BufferedReader(in);
            FileWriter out = new FileWriter("destino.txt");
            while (linea != null) {
                out.write(linea);
                linea = entrada.readLine();
                out.flush();
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