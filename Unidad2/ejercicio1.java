//EJERCICIO 1 ALGORITMOS
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, numero3;
        System.out.println("Escribe el primer número: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo número: ");
        numero2 = scanner.nextInt();
        System.out.println("Escribe el tercer número: ");
        numero3 = scanner.nextInt();
        
        //Saco los número mayor, el mediano y el menor
        int mayor = Math.max(Math.max(numero1, numero2), numero3); 
        int menor = Math.min(Math.min(numero1, numero2), numero3);
        int medio = Math.max(Math.min(numero1, numero2), numero3);
        boolean posible_error_medio = false;
        int repetidos = 0;

        //Aqui lo que hago es asegurar que el medio se ha calculado correctamente, si no lo estuviera se corrije
        if (mayor == medio) {
            posible_error_medio = true;
        }
        if (menor == medio) {
            posible_error_medio = true;
        }
        if (posible_error_medio == true) {
            medio = Math.max(Math.min(numero1, numero3), numero2);
        }
        if (mayor == medio) {
            posible_error_medio = true;
        }
        if (menor == medio) {
            posible_error_medio = true;
        }
        if (posible_error_medio == true) {
            medio = Math.max(Math.min(numero2, numero3), numero1);
        }
        //Aqui comparo si hay algun numero repetido    
        if (mayor == medio) {
            repetidos = (0 + 1);
        }   if (mayor == menor) {
            repetidos  = (repetidos + 1);
        }   if (menor == medio) {
            repetidos = (repetidos + 1);
        }
            if (repetidos == 1) {
            System.out.println("Hay dos repetidos");
            } else if (repetidos == 3) {
            System.out.println("Hay tres repetidos");
            } if (repetidos == 0) {
            System.out.print("\nEl número mayor es " + mayor + ", el número mediano es " + medio + " y el número menor es " + menor);
            }
        scanner.close();
    }
}