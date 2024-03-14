import java.io.*;
import java.util.*;
public class amigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables
        String nombre;
        String telefono;
        boolean bucle = true;
        File f = new File ("amigos.bin");
        while (!bucle) {
            System.out.println("Escribe el nombre de tu amigo: ");
            nombre = sc.nextLine();
            System.out.println("Escribe el telefono de tu amigo: ");
            telefono = sc.nextLine();
            // se comprueba que el archivo exista, si no se crea
            if (!f.exists()) {
                f.createNewFile();
            // SERIALIZAR OBJETOS
            try {
                FileOutputStream fs = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fs);

                Amigo a = new Amigo((nombre), (telefono));
                oos.writeObject(a);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // DESERIALIZAR OBJETOS
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                System.out.println("Listado de amigos en el fichero: ");
                Amigo a1 = (Amigo)ois.readObject();
                a1.datosAmigo();
                ois.close();
                fis.close();
            } catch (IOException e) {
                System.out.println("Excepcion: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Excepcion: " + e.getMessage());
            }
        }
        sc.close();
    }
}
