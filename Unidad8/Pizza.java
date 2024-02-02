//Carlos C de DAW1 ^^
public class Pizza {
    //variables
    private String tamano;
    private String tipo;
    private String estado;
    private int totalPedidas;
    private int totalServidas;
    //Se establece como estado standard de las pizzas "pedida"
    public Pizza (String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;        
        this.estado = "pedida";
        totalPedidas += 1;
    }

    // Getters y Setters //
    // Getters
    public int getTotalPedidas() {
        return totalPedidas;
    }
    public int getTotalServidas() {
        return totalServidas;
    }
    // Setters
    public void setTotalPedidas (int pedidas) {
        this.totalPedidas = pedidas;
    }
    public void setTotalServidas (int servidas) {
        this.totalServidas = servidas;
    }
}