public class ejercicio6 {
    
    public static void main(String[] args) {
        
        String nombrecompleto = "Carlos Castañeda García";

        String[] palabras = nombrecompleto.split(" ");

        for (String palabra : palabras) {
            Integer longitud = palabra.length();
            System.out.println("Longitud de la palabra '" + palabra + "': " + longitud);
        }
    }
}