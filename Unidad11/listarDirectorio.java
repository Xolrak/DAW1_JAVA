// Carlos C de DAW1 ^^ //
// librerias importadas
import java.util.Scanner;
import java.io.File;
public class listarDirectorio {
    public static void main(String[] args) {
        String ruta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la ruta del directorio que quieras listar: ");
        ruta = sc.nextLine();
        if (ruta.length() > 0) {
            File f = new File(ruta);
            if(f.isDirectory()) {
                File [] ficheros = f.listFiles();
                System.out.println("Listado de los ficheros");
                for(File file : ficheros) {
                    System.out.println("\t" + file.getName());
                }
            }
        sc.close();
        }
    }
}
