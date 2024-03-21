// Carlos C de DAW1 ^^ //
// librerias importadas
import java.util.*;
import java.io.*;

public class Galaxies {
    public static void main(String [] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        // variables //
        //String object;
        //String con;
        //String ra;
        //String mag;
        //String dec;
        //String linea;
        // variable para almacenar el nombre del .txt que contiene los datos
        File BD_Celestes = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        // variable para almacenar el nombre del .bin que almacenará los datos
        File BDF_Celestes = new File("SAC.bin");
        try {
            FileReader fr = new FileReader(BD_Celestes);
            BufferedReader br = new BufferedReader(fr);
            FileOutputStream xs = new FileOutputStream(BD_Celestes, true);
            ObjectOutputStream oos = new ObjectOutputStream(xs);
            String linea;
            linea = br.readLine();
            while ((linea) != null) {
                String partes[] = linea.split(",");
                String object=partes[0];
                String con=partes[3];
                String ra=partes[4];
                String dec=partes[5];
                String mag=partes[6];
                String type=partes[2];
                if (type.equals("\"GALXY\"")) {
                    Galaxy a = new Galaxy(object,con,ra,dec,mag);
                    oos.writeObject(a);
                    System.out.println(a);
                }
                linea = br.readLine();
            }
            oos.close();
            xs.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
        //sc.close;
    }
}