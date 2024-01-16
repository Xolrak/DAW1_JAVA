import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TurnOMatik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> clients = new LinkedList<String>();
        while (true) {
            System.out.println("1 - Nuevo cliente ha entrado");
            System.out.println("2 - Atender al siguiente cliente");
            System.out.println("3 - Mostrar cola actual");
            System.out.println("0 - Salir");
            String action = sc.nextLine();
            if ("0".equals(action)) {
                System.out.println("Saliendo...");
                break;
            } else {
                switch (action) {
                    case "1":
                        System.out.println("Escriba el nombre del nuevo cliente: ");
                        String NewClient = sc.nextLine();
                        clients.add(NewClient);
                        break;
                    case "2":
                        String firstClient = clients.poll();
                        System.out.println("Ultimo cliente atendido: " + firstClient);
                        System.out.println("Clientes en cola: "+ clients);
                        break;
                    case "3":
                        System.out.println("Cola actual: ");
                        Iterator<String> iterator = clients.iterator();
                        int position = 1;
                        while (iterator.hasNext()) {
                            System.out.println("Cliente " + position + ": " + iterator.next());
                            position++;
                        }
                        break;
                    default:
                        System.out.println("Entrada no aceptada, escriba un valor valido");
                        sc.close();
                        return;
                }
            }
        }
        sc.close();
    }
}