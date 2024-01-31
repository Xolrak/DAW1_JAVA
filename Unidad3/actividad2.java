import java.util.Scanner;
public class actividad2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        int resultado = 1;

        for (int i = 1; i <= exponente; i++)    {
            resultado *= base;
        }
        System.out.println("El resultado de la potencia de " + base + " elevado a " + exponente + " es: " + resultado);
        scanner.close();
    }
}