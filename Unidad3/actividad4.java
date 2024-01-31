import java.util.Scanner;

public class actividad4 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número: ");
        final int NUMERO = scanner.nextInt();
        int i = 2;
        boolean primo = true;

        while (i <= Math.sqrt(NUMERO)) {
            if (NUMERO % i == 0) {
                primo = false;
                break;
            }   
            i++;
        }
        if (primo == true) {
            System.out.print("El número " + NUMERO + " es primo.");
        } else {
            System.out.print("El número " + NUMERO + " no es primo");
        }
    scanner.close();
    }
}
