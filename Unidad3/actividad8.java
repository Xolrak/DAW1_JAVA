import java.util.Scanner;
public class actividad8 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro las variables
        int user;
        int ai;
        String resultado;

        //Uso un random para que se cree la respuesta del PC
        ai = (int) (Math.random()* 5 + 1);
        
        System.out.println("Elige entre: \n" + 
        "1 - Piedra\n" + "2 - Papel\n" + "3 - Tijeras\n" + "4 - Lagarto\n" + "5 - Spock");
        user = sc.nextInt();
        //Se comprueba que el usuario haya escrito un número válido del 1 al 5
        while (user > 5 || user < 1) {
            System.out.println("Número no válido, introduzca uno válido.");
            user = sc.nextInt();
    }
        if ((user == 1 && ai == 2) || (user == 1 && ai == 4) || 
        (user == 2 && ai == 3) || (user == 2 && ai == 5) ||
        (user == 3 && ai == 4) || (user == 3 && ai == 1) ||
        (user == 4 && ai == 5) || (user == 4 && ai == 2) ||
        (user == 5 && ai == 1) || (user == 5 && ai == 3)) {
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