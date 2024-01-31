import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //DECLARO LAS VARIABLES NECESARIAS PARA EL PROGRAMA
        int numero_aracnidos, numero_insectos, numero_cienpies, numero_milpies;
        int patas_aracnidos = 8;
        int patas_insectos = 6;
        int patas_cienpies = 30; 
        int patas_milpies = 60;

        System.out.print("Introduce el número de arañas que has encontrado: ");
        numero_aracnidos = scanner.nextInt();
        System.out.print("Introduce el número de insectos que has encontrado: ");
        numero_insectos = scanner.nextInt();
        System.out.print("Intruce el número de cienpies que has encontrado: ");
        numero_cienpies = scanner.nextInt();
        System.out.print("Introduce el número de milpies que has encontrado: ");
        numero_milpies = scanner.nextInt();

        System.out.print("El número total de patas de arácnidos que tienes es: " + (patas_aracnidos * numero_aracnidos) + " patas");
        System.out.print("\nEl número total de patas de insectos que tienes es: " + (patas_insectos * numero_insectos) + " patas");
        System.out.print("\nEl número total de patas de cienpies que tienes es: " + (patas_cienpies * numero_cienpies) + " patas aproximadamente");
        System.out.print("\nEl número total de patas de milpies que tienes es: " + (patas_milpies * numero_milpies) + " patas aproximadamente");
        
        scanner.close();
    }
}
