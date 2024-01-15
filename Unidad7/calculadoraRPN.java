//Carlos C de DAW1
import java.util.Scanner;
import java.util.Stack;
public class calculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creo la pila con el parametro Double para que se pueda operar con decimales
        Stack<Double> pila = new Stack<>();
        while (true) {
            if (sc.hasNextDouble()) {
                // en caso de ser un Double se sigue operando
                pila.push(sc.nextDouble());
            } else {
                //En caso de no ser un Double se pasaría a considerar String
                String operacion = sc.next();
                //Se comprueba que el usuario no quiera salir del programa
                if ("q".equals(operacion)) {
                    System.out.println("Saliendo...");
                    break;
                //Si no hay suficientes operadores saltará un mensaje de error
                } else if (pila.size() < 2) {
                    System.out.println("Error: no hay suficientes operadores para realizar la operación");
                    continue;
                }
                //Asignamos a dos variables el resultado de la pila
                double operador2 = pila.pop();
                double operador1 = pila.pop();
                double resultado;
                //Se hace un swich para las distintas operaciones
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
                        //En caso de que el usuario haya puesto un tipo de operacion que no 
                        //sean la +, -, * o / se imprimirá un mensaje de error
                        System.out.println("Error: operación no soportada");
                        sc.close();
                        return;
                }
                //Se pone en la pila el ultimo resultado para seguir operando con este
                pila.push(resultado);
                System.out.println("El resultado es: " + resultado);
            }
        }
        sc.close();
    }
}