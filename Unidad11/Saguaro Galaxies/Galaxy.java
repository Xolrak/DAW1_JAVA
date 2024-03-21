// librerias importadas
import java.io.*;

public class Galaxy implements Serializable {
    // variables privadas de la clase
    private String object;
    private String con;
    private String ra;
    private String mag;
    private String dec;
    
    // constructor
    public Galaxy (String object, String con, String ar, String mag, String dec) {
        this.object = object.replaceAll("\\s", "").replaceAll("\"", "");
        this.con = con.replaceAll("\"","");
        this.ra = ra.replaceAll("\"","");
        this.mag = mag.replaceAll("\"","");
        this.dec = dec.replaceAll("\"","");
    }
    // metodo que agrupa en un unico String
    public String toString() {
        // se concatenan las valores y se separan por comas
        return (object + " , " + con + " , " + ra + " , " + dec + " , " + mag);
    }
}