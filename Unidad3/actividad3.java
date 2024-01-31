import java.util.Scanner;
public class actividad3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca el número: ");
        int numero = scanner.nextInt();
        int cont = 0;
        //He hecho otra variable con el mismo número introducido para que el número original no sea afectado por las operaciones dentro del "while"
        int numero_conteo = numero;
        //Aquí comparo el numero para determinar si es positivo y lo cuento
        while (numero_conteo > 0) {
            numero_conteo /= 10;
            cont++;
        }
        //Aquí comparo el numero para determinar si es negativo y lo cuento
        while (numero_conteo < 0) {
            numero_conteo /= 10;
            cont++;
        }
        if (cont < 7 && numero > 0 && numero < 1000000) {
            System.out.print("Tu número positivo " + numero + " tiene " + cont + " digitos");
        } else if (cont < 7 && numero < 0 && numero > -1000000) {
            System.out.print("Tu número negativo " + numero + " tiene " + cont + " digitos");
        } else {
            System.out.print("Tu número " + numero + " sobrepasa los 6 digitos. No es válido.");
        }
        scanner.close();
    }
}