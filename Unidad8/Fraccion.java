//Carlos C de DAW1
public class Fraccion {
    private int numerador;
    private int denominador;
    // Constructor por defecto que crea la fracción 1/1
    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }
    // Constructor con parámetros para crear una fracción personalizada
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("Error: el denominador no puede ser cero. Se establecerá a 1.");
            this.denominador = 1;
        }
    }
    // Método para invertir la fracción
    public void invertir() {
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }
    // Método para simplificar la fracción
    public void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }
    // Método para multiplicar la fracción por otra fracción
    public void multiplicar(Fraccion otraFraccion) {
        numerador *= otraFraccion.numerador;
        denominador *= otraFraccion.denominador;
    }
    // Método para dividir la fracción por otra fraccion
    public void dividir(Fraccion otraFraccion) {
        if (otraFraccion.numerador != 0) {
            numerador *= otraFraccion.denominador;
            denominador *= otraFraccion.numerador;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    // Método privado para calcular el maximo común divisor
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
    // Método para obtener la representacion de la fracción como cadena de texto
    public String toString() {
        return numerador + "/" + denominador;
    }
        // Método para probar la clase
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(2, 5);
        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        fraccion1.invertir();
        System.out.println("Inversa de Fracción 1: " + fraccion1);
        fraccion1.simplificar();
        System.out.println("Fracción 1 simplificada: " + fraccion1);
        fraccion1.multiplicar(fraccion2);
        System.out.println("Multiplicación de Fracción 1 y Fracción 2: " + fraccion1);
        fraccion1.dividir(fraccion2);
        System.out.println("División de Fracción 1 por Fracción 2: " + fraccion1);
    }
}