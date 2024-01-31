import java.util.Scanner;
public class actividad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del número: ");
        int numero = scanner.nextInt();

        int i = 1;
        int j = 1;

        while (i <= numero) {
            while (j <= numero) {
                int valor = i + j + i * j;
                System.out.println("Par (" + i + "," + j + "): " + i + " + " + j + " + " + i + " * " + j + " vale " + valor);   
                j++;
            }
            j = 1;
            i++;
        }
        scanner.close();
    }
}