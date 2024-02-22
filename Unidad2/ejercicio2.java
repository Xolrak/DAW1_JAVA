import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gs_admision = false;
        String gm_superado, bachiller_superado, prueba_acceso_superada;
        String Mensaje_ok = "Cumples con los requisitos para acceder al grado superior";

        System.out.println("¿Has superado alguna FP de grado medio? (S/N) ");
        gm_superado = scanner.nextLine();
        System.out.println("¿Has superado bachillerato? (S/N) ");
        bachiller_superado = scanner.nextLine();
        System.out.println("¿Has superado la prueba de acceso? (S/N)");
        prueba_acceso_superada = scanner.nextLine();

        if (gm_superado == "S") {
            gs_admision = true;
            System.out.println("Reunes los requisitos para acceder al grado superior");
            }
            if (bachiller_superado == "S") {
            gs_admision = true;
            System.out.println("Reunes los requisitos para acceder al grado superior");
            }
            if (prueba_acceso_superada == "S") {
            gs_admision = true;
            System.out.println("Reunes los requisitos para acceder al grado superior");
            }
                if (gs_admision = false) {
                    System.out.println("No reunes los requisitos para acceder al grado superior");
                    }
            scanner.close();
    }

}