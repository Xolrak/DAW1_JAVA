public class cuadrado extends figuras {
    private double lado;
    public cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double area () {
        area = lado * lado;
        return area;
    }
    @Override
    public double perimetro() {
        perimetro = 4 * lado;
        return perimetro;
    }
}