import java.util.Scanner;
public class actividad6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String sdia1 = "";
		String sdia2 = "";
        System.out.println("Introduce el número del día de la semana:\n" + "1 - Lunes\n" + "2 - Martes\n" + 
        "3 - Miercoles\n" + "4 - Jueves\n" + "5 - Viernes\n" + "6 - Sabado\n" + "7 - Domingo");
        int dia_1 = sc.nextInt();
            while (dia_1 >= 8 || dia_1 <= 0) {
                System.out.println("Has escrito un valor no válido. Introduce un número correcto: ");
                dia_1 = sc.nextInt();
        }
        System.out.println("Introduce la hora del dia (desde 0 horas hasta 23 horas): ");
        int hora1 = sc.nextInt();
            while (hora1 >= 24 || hora1 <= -1) {
                System.out.println("Has escrito un valor no válido. Introduce un número correcto: ");
                hora1 = sc.nextInt();
                hora1 = 24-hora1;
                System.out.print(hora1);
        }
        System.out.println("Introduce el número del día de la semana: ");
        int dia_2 = sc.nextInt();
            while (dia_2 >= 8 || dia_2 <= 0 || dia_1 == dia_2) {
                System.out.println("Has escrito un valor no válido. Introduce un número correcto: ");
                dia_2 = sc.nextInt();
        }
        System.out.println("Introduce la hora del dia: ");
        int hora2 = sc.nextInt();
            while (hora2 >= 24 || hora2 <= -1) {
                System.out.println("Has escrito un valor no válido. Introduce un número correcto: ");
                hora2 = sc.nextInt();
        }
        switch (dia_1) {
			case 1: sdia1 = "lunes"; break;
			case 2: sdia1 = "martes"; break;
			case 3: sdia1 = "miercoles"; break;
			case 4: sdia1 = "jueves"; break;
			case 5: sdia1 = "viernes"; break;
			case 6: sdia1 = "sabado"; break;
			case 7: sdia1 = "domingo"; break;
		}
		switch (dia_2) {
			case 1: sdia2 = "lunes"; break;
			case 2: sdia2 = "martes"; break;
			case 3: sdia2 = "miercoles"; break;
			case 4: sdia2 = "jueves"; break;
			case 5: sdia2 = "viernes"; break;
			case 6: sdia2 = "sabado"; break;
			case 7: sdia2 = "domingo"; break;
		}
        System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s \n", hora1, 
        sdia1, hora2, sdia2, (24-hora1) + (24* (dia_2-dia_1-1)) + hora2);
        sc.close();
    }
}