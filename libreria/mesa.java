package libreria;

public class mesa {
    private String color;
    private int npatas;
    private int ancho;
    private int alto;
    private String material;
    
    public mesa() {
        this.color = "blanco";
        this.npatas = 4;
        this.ancho = 100;
        this.alto = 100;
        this.material = "madera";
    }
    public mesa (String a_color, int a_patas, int a_ancho, int a_alto, String a_material) {
        this.color = a_color;
        this.npatas = a_patas;
        this.ancho = a_ancho;
        this.alto = a_alto;
        this.material = a_material;
    }
    public void setColor (String a_color) {
        this.color = a_color;
    }
    public String getColor() {
        return this.color;
    }
}
