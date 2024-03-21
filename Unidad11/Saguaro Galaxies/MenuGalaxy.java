// Carlos C de DAW1 ^^ //
// librerias importadas
import java.util.*;
import java.io.*;

public class MenuGalaxy {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // variables
        String object;
        String con;
        String ra;
        String mag;
        String dec;
        File fileDocBin = new File("SAC.bin");
        // variables para controlar la logica del bucle
        boolean continua = true;
        int eleccion;
        
        while(continua) {
            System.out.println("A que datos quieres acceder?");
            System.out.println("1 - Objetos");
            System.out.println("2 - Constelaciones");
            System.out.println("3 - Magnitud limite");
            System.out.println("4 - Salir de la app");
            try {
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        FileInputStream fis = new FileInputStream(fileDocBin);
                        DataInputStream dis = new DataInputStream(fis);
                        Scanner scanner = new Scanner(dis);
                        while (scanner.hasNextLine()) {
                            String linea = scanner.nextLine();
                            String[] campos = linea.split(",");
                            object = campos[0];
                            // se enseña por pantalla el objeto
                            System.out.println("OBJECT: " + object);
                        }

                        scanner.close();
                        dis.close();
                        fis.close();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opción seleccionada no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("No has introducido ningún numero");
                continua = false;
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el archivo SAC.bin");
                continua = false;
            } catch (IOException e) {
                e.printStackTrace();
                continua = false;
            }
        }
        sc.close();
        
    }
}
