import java.util.Scanner;
public class bbdd {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        // variables
        int eleccion;
        
        // menú
        System.out.println("¡Bienvenido a tu gestor de Reservas!");
        System.out.println("¿Que acción deseas hacer?");
        System.out.println("1 - Alta vuelo");
        System.out.println("2 - Alta pasajero");
        System.out.println("3 - Reserva vuelo");
        System.out.println("4 - Modificar reserva");
        System.out.println("5 - Baja reserva");
        System.out.println("0 - Salir");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Has introducido caracter/es que no contemplados");
                break;
        }       
        
        
        
        sc.close();
    }
}