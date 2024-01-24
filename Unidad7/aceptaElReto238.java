import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class aceptaElReto238 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Guardo el valor de los billetes
        int[] valorBillete = {10, 20, 50, 200, 500};
        System.out.println("Cantidad de billetes a repartir: ");
        int billetes = sc.nextInt();
        System.out.println("Cantidad de miembros de la banda: ");
        int thiefCount = sc.nextInt();
        
        sc.close();
    }
}