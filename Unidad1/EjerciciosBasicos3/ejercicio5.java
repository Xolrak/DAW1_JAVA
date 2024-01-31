import java.util.Scanner;
import java.lang.Math;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int capacidad_cazuela,huevos,tandasHuevos;

        System.out.print("Introduce el número de huevos que quieres meter en la cazuela: ");
        huevos = scanner.nextInt();
        System.out.print("Introduce el número de huevos que caben en la cazuela: ");
        capacidad_cazuela = scanner.nextInt();
        
        tandasHuevos = huevos / capacidad_cazuela;
        int tiempoFinal = tandasHuevos * 10;
        System.out.print("El tiempo de cocción total es de " + tiempoFinal + " minutos");
        scanner.close();
    }
}
