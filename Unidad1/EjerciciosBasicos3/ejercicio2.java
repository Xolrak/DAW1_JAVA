import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Introduce tu altura: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);

        scanner.close();
    }
}