import java.util.Scanner;
import java.util.Stack;

public class calculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> pila = new Stack<>();

        while (true) {
            if (sc.hasNextDouble()) {
                // en caso de ser un Double se sigue operando
                pila.push(sc.nextDouble());
            } else {
                String operacion = sc.next();
                if (pila.size() < 2) {
                    System.out.println("No hay suficientes operadores para realizar la operación");
                    break;
                }

                // Asignamos a dos variables el resultado de la pila
                double operador2 = pila.pop();
                double operador1 = pila.pop();
                double resultado;

                switch (operacion) {
                    case "+":
                        resultado = operador1 + operador2;
                        break;
                    case "-":
                        resultado = operador1 - operador2;
                        break;
                    case "*":
                        resultado = operador1 * operador2;
                        break;
                    case "/":
                        resultado = operador1 / operador2;
                        break;
                    default:
                        System.out.println("Error: operador no reconocido.");
                        sc.close();
                        return;
                }

                pila.push(resultado);
                System.out.println("El resultado es: " + resultado);
            }
        }

        sc.close();
    }
}
