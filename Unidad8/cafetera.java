//Carlos C de DAW1
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
}