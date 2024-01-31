import java.util.Scanner;

public class ejercicio4 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("La colmena ha pasado por un periodo de crisis por falta de miel.");
        System.out.println("Antes de la crisis, cuanta miel producian? En ml");
        int antes_crisis = scanner.nextInt();
        System.out.println("Durante el primer año de la crisis cuanta miel producian? En ml");
        int crisis_año1 = scanner.nextInt();
        System.out.println("Durante el segundo año de la crisis cuanta miel producian? En ml");
        int crisis_año2 = scanner.nextInt();
        System.out.println("Durante el tercer año cuanta miel producian? En ml");
        int crisis_año3 = scanner.nextInt();
        System.out.println("Después de la crisis cuanta miel producian? En ml");
        int despues_crisis = scanner.nextInt();

        if (despues_crisis >= crisis_año1 && despues_crisis >= crisis_año2 && despues_crisis >= crisis_año3 && despues_crisis >= antes_crisis) {
            System.out.println("Despúes de la crisis la economia de la colmena supero al estado anterior a la crisis");
          } else {
            System.out.println("Después de la crisis la economia de la colmena no supero o igualó su estado anterior a la crisis");
          }
          scanner.close();
    }
}