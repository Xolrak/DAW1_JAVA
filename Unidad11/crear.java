// Carlos C de DAW1 ^^ //
// librerias importadas
import java.io.File;
import java.io.IOException;
public class crear {
    public static void main(String[] args) {
        try {    
            File file = new File("fichero.txt");
            if (file.createNewFile()) {
                System.out.println("Fichero ha sido creado: " + file.getName());
            } else {
                System.out.println("Fichero existente.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear fichero");
        }
    }   
}