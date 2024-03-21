// Carlos C de DAW1 ^^ //
// librerias importadas
import java.util.*;
import java.io.*;

public class Galaxies {
    public static void main(String [] args) {
        //Scanner sc = new Scanner(System.in);
        // variables //
        String object;
        String con;
        String ra;
        String mag;
        String dec;
        String linea;
        // variable para almacenar el nombre del .txt que contiene los datos
        File BD_Celestes = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        // variable para almacenar el nombre del .bin que almacenará los datos
        File BDF_Celestes = new File("SAC.bin");
        FileReader fr = new FileReader(BD_Celestes);
        BufferedReader br = new BufferedReader(fr);
        while ((linea) != null) {
            String linea_completa = linea.split(",");

        }

        //sc.close;
    }
}