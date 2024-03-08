// Carlos C de DAW1 ^^ //
// librerias importadas
import java.io.File;
import java.util.Scanner;

public class rmj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(args[0]);
        if(file.exists()) {
            if (file.isDirectory()) {
                System.out.println("Es un directorio");
            } else {
                file.delete();
            }
        } else {
            System.out.println("El fichero no existe");
        }
        sc.close();
    }
}