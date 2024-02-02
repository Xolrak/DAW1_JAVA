//Carlos C de DAW1 ^^
public class Pizza {
    //variables
    private String tamano;
    private String tipo;
    private String estado;
    private static int totalPedidas;
    private static int totalServidas;
    //Se establece como estado standard de las pizzas "pedida"
    public Pizza (String tipo, String tamano) {
        this.tamano = tamano;
        this.tipo = tipo;        
        this.estado = "pedida";
        totalPedidas += 1;
    }
    public void sirve () {
        if ("servida".equals(this.estado)) {
            System.out.println("pizza servida");

        } else {
            this.estado = "servida";
            totalServidas += 1;
        }
    }
    // Getters //
    public static int getTotalPedidas() {
        return totalPedidas;
    }
    public static int getTotalServidas() {
        return totalServidas;
    }
    public String getTamano () {
        return this.tamano;
    }
    // Se pasa a String
    public String toString () {
        return "pizza " + tipo + " , " + tamano + " ," + estado;
    }
}