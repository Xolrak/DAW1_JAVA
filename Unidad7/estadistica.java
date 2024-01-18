//Carlos C de DAW1
import java.util.ArrayList;
import java.util.Scanner;
public class estadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Hago una array en formato double para que pueda tener
        ArrayList<Double> numeros = new ArrayList<>(); 
        while (true) {
            System.out.println("Introduzca un número o 'q' para salir: ");
            String entrada = sc.nextLine();
            //Se comprueba que el usuario no quiera salir del programa
            if ("q".equals(entrada)) {
                System.out.println("Saliendo...");
                break;
            }
            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);

                double media = calcularMedia(numeros);
                double DesviacionTipica = calcularDesviacionTipica(numeros, media);

                System.out.println("Media: " + media);
                System.out.println("Desviacion tipica: " + DesviacionTipica);                
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido o 'q' para salir.");
            }
        }
        sc.close();
    }
    private static double calcularMedia(ArrayList<Double> numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }
    private static double calcularDesviacionTipica(ArrayList<Double> numeros, double media) {
        double sumaDiferencias = 0;
        for (double numero : numeros) {
            sumaDiferencias += Math.pow(numero - media, 2); 
        }
        return Math.sqrt(sumaDiferencias / numeros.size());
    }
}