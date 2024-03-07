// Carlos C de DAW1 ^^ //
// librerias importadas
import java.io.File;
import java.io.IOException;
public class dir {
    public static void main(String[] args) {
        File file = new File("./dirpruebas");
        if (file.mkdir()) {
            System.out.println("Directorio creado: " + file.getName());
        } else {
            System.out.println("El directorio ya existe");
        }
    }
}
