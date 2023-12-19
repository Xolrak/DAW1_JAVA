import java.util.Scanner;
public class actividad3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int [] [] matriz = new int[4][4];
        boolean esSimetrica = true;
        //Bucle para hacer la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                System.out.print("Introduce el valor de la celda [" + x + "][" + y + "]: ");
                matriz [x] [y] = sc.nextInt();
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (matriz[x][y] != matriz[y][x]) {
                    esSimetrica = false;
                }
            }
        }
        if (esSimetrica) {
            System.out.print("La matriz es simetrica");
        } else {
            System.out.print("La matriz no es simetrica");
        }
        //Comprobar la matriz
        sc.close();
    }
}