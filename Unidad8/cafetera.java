//Carlos C de DAW1

import java.util.Scanner;

public class cafetera {
       //declaracion de variables
       private int capacidadMaxima;
       private int capacidadActual;
       //Constructor predeterminado
       public cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
       }
       //Constructor con la capacidad maxima
       public cafetera (int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
       }
       //Constructor con la capacidad maxima y actual
       public cafetera (int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadActual > capacidadMaxima) {
            this.capacidadActual = capacidadMaxima;
        } else {
            this.capacidadActual = capacidadActual;
        }
       }
       // Getters y Setters //
       public int getcapacidadMaxima () {
        return capacidadMaxima;
       }
       public void setcapacidadMaxima (int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
       }
       public int getcapacidadActual () {
        return capacidadActual;
       }
       public void setcapacidadActual (int capacidadActual) {
        this.capacidadActual = capacidadActual;
       }
       //Llenar la cafetera
       public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
       }
       //Servir una taza
       public void servirTaza (int capacidadTaza) {
        if (capacidadActual >= capacidadTaza) {
            capacidadActual -= capacidadTaza;
            System.out.println("Le he servido una taza de " + capacidadTaza + "ml");
        } else {
            System.out.println("No queda suficiente café");
            capacidadActual = 0;
        }
       }
       //Vacio la tetera
       public void vaciarTetera () {
        capacidadActual = 0;
       }
       //Agregar café a la cafetera
       public void agregarCafe (int cantidad) {
        if (capacidadActual + cantidad <= capacidadMaxima) {
            cantidad += cantidad;
        } else {
            capacidadActual = capacidadMaxima;
        }
       }
        public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an instance of Cafetera with default values
        cafetera cafetera = new cafetera();
        boolean bool=false;
        while (!bool){
            System.out.println("");
            System.out.println("Menu: ");
            System.out.println("1. Servir una taza");
            System.out.println("2. Agregar cafe");
            System.out.println("3. vaciar cafetera");
            System.out.println("4. Maxear cafetera");
            System.out.println("5. Salir");
            System.out.print("Que haces?: ");
            String answ = sc.nextLine();
            switch (answ) {
                case "1": //servir 1 taza d cafe
                    System.out.println("Antes hay " + cafetera.getcapacidadActual() + "ml de cafe");
                    cafetera.servirTaza(200);
                    System.out.println("Capacidad Actual Después de Servir Taza: " + cafetera.getcapacidadActual());
                    break;
                case "2": //agregar cafe
                    int add = sc.nextInt();
                    cafetera.agregarCafe(add);
                    System.out.println("Capacidad Actual Después de agregar cafe: " + cafetera.getcapacidadActual());
                    break;
                case "3": //Vaciar cafetera
                    System.out.println("Antes hay" + cafetera.getcapacidadActual() + "ml de cafe");
                     cafetera.vaciarTetera();
                    System.out.println("Ahora quedan : " + cafetera.getcapacidadActual() + "ml de cafe");
                    break;
                case "4": //Maxear cafetera
                    System.out.println("Antes hay" + cafetera.getcapacidadActual() + "ml de cafe");
                    cafetera.llenarCafetera();
                    System.out.println("Ahora quedan : " + cafetera.getcapacidadActual() + "ml de cafe");
                    break;
                case "5": //Salir
                    System.out.println("En la cafetera habian : " + cafetera.getcapacidadActual() + "ml de cafe");
                    bool=true;
                    break;
                default:
                    break;
            }
            
           
        }
    }
}
