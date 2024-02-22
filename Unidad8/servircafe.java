public class servircafe {

    public static void main(String[] args) {

        // Crea una cafetera con capacidad máxima de 1000 ml
        cafetera cafetera = new cafetera();

        // Llena la cafetera
        cafetera.llenarCafetera();

        // Sirve una taza de 200 ml
        cafetera.servirTaza(200);

        // Muestra la capacidad actual (800 ml)
        System.out.println("Capacidad actual: " + cafetera.getcapacidadActual());

        // Vacía la cafetera
        cafetera.vaciarTetera();

        // Agrega 500 ml de café
        cafetera.agregarCafe(500);

        // Muestra la capacidad actual (500 ml)
        System.out.println("Capacidad actual: " + cafetera.getcapacidadActual());

    }

}