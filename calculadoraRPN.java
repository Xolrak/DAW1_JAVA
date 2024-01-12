import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class calculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();
        //Declaro los dos huecos de la calculadora
        pila.push(sc.nextDouble());
        pila.push(sc.nextDouble());
        String operacion = sc.nextLine();
        //Asignamos a dos variables el resultado de la pila
        double operador1 = pila.pop();
        double operador2 = pila.pop();
        double resultado;
        //Operaciones según la elección
        switch (operacion) {
            case "+":
                resultado = operador1 + operador2; 
                System.out.println("El resultado es: " + resultado);
                break;
            case "-":
                resultado = operador1 - operador2; 
                System.out.println("El resultado es: " + resultado);
                break;
            case "*":
                resultado = operador1 * operador2; 
                System.out.println("El resultado es: " + resultado);
                break;
            case "/":
                resultado = operador1 / operador2; 
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                break;
        }
        
        sc.close();
    }    
}
