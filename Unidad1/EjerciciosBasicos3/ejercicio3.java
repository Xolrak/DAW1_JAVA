import java.util.Scanner;
import java.lang.Math;

public class ejercicio3 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x1, x2;

        System.out.print("Introduce el valor de a: ");
        a = scanner.nextFloat();
        System.out.print("Introduce el valor de b: ");
        b = scanner.nextFloat();
        System.out.print("Introduce el valor de c: ");
        c = scanner.nextFloat();
         
        x1 = (-b + (Math.sqrt((2 + b) - (4 * a * c))));
        System.out.print("El resultado de x1 es: " + x1);
        x2 = (-b - (Math.sqrt((2 + b) - (4 * a * c))));
        System.out.print(" y el resultado de x1 es: " + x2);
    }
}