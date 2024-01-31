import java.util.Scanner;
public class actividad7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro las variables
        int user;
        int ai;
        String resultado;

        //Uso random para hacer un numero entre 1 y 3
        ai = (int) (Math.random()* 3 + 1);
        System.out.println("Elige:\n" +
        "1 - Piedra\n"+ "2 - Papel\n" + "3 - Tijera");
        user = sc.nextInt();
        //Se comprueba que el usuario haya escrito un número válido
        while (user > 3 || user < 1) {
            System.out.println("Número no válido, introduzca uno válido.");
            user = sc.nextInt();
        }
        if ((user == 1 && ai == 3) || (user == 2 && ai == 1) || (user == 3 && ai == 2)) {
            resultado = "Jugador gana";
        } else if (user == ai) {
            resultado = "Empate";
        } else {
            resultado = "La IA gana";
        }
        System.out.print(resultado + (". La IA usó " + ai + " y el jugador " + user));
        sc.close();
    }
}