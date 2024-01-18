//Carlos C de DAW1
import java.util.ArrayList;
import java.util.Scanner;
public class estadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hago una array en formato double para que pueda tener
        ArrayList<Double> numeros = new ArrayList<>(); 
        //Bucle del programa que funcionará infinitamente hasta que el usuario ponga 'q'
        while (true) {
            System.out.println("Introduzca un número o 'q' para salir: ");
            String entrada = sc.nextLine();
            //Se comprueba que el usuario no quiera salir del programa
            if ("q".equals(entrada)) {
                System.out.println("Saliendo...");
                break;
            }
            try {
                //Se intenta convertir la entrada de String a double
                double numero = Double.parseDouble(entrada);
                //En caso de que sea un double se añade a la Array
                numeros.add(numero);
                //Se mete en las variables el calculo de la media y la desviacion tipica de las clases
                double media = calcularMedia(numeros);
                double DesviacionTipica = calcularDesviacionTipica(numeros, media);
                System.out.println("Media: " + media);
                System.out.println("Desviacion tipica: " + DesviacionTipica);                
            } catch (NumberFormatException e) {
                //En caso de que haya algun error en la entrada saldrá este mensaje de error
                System.out.println("Introduce un número válido o 'q' para salir.");
            }
        }
        sc.close();
    }
    //Clase para calcular la media
    private static double calcularMedia(ArrayList<Double> numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }
    //Clase para calcular la desviacion tipica
    private static double calcularDesviacionTipica(ArrayList<Double> numeros, double media) {
        double sumaDiferencias = 0;
        for (double numero : numeros) {
            sumaDiferencias += Math.pow(numero - media, 2); 
        }
        return Math.sqrt(sumaDiferencias / numeros.size());
    }
}