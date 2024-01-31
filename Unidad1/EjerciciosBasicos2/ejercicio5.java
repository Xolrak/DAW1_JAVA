public class ejercicio5 {

    public static void main(String[] args) {
        
        String nombrecompleto = "Carlos Castañeda García";

                String[] partes = nombrecompleto.split(" ");

        String nombre = partes[0];
        String apellido1 = partes[partes.length - 2];
        String apellido2 = partes[partes.length - 1];

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + apellido1);
        System.out.println("Segundo apellido: " + apellido2);
    }
}