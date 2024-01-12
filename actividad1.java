import java.util.Scanner;
public class actividad1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaro array de 15 espacios
        int [] array = new int[15];
        //Bucle (for) para almacenar la array
        for (int count = 0; count < 15; count++) {
            System.out.println("Números introducidos en consola: " + count);
            System.out.println("Introduce un número: ");
            array[count] = sc.nextInt();
        }
            System.out.print("\nTu elección: " + array[14]);
        for (int x = 0; x < 14; x++) {
            System.out.print("\nTu elección: " + array[x]);
        }
        sc.close();
    }
}