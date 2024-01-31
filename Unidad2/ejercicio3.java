import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {

        int n = 0;

        int suma = 0;

        System.out.println("Introduce el número de números que quieres promediar: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            suma += numero;
        }
        int promedio = suma / n;

        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }
}