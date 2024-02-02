public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizzas("margarita", "mediana");
        Pizza p2 = new Pizzas("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizzas("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizzas.getTotalPedidas());
        System.out.println("servidas: " + Pizzas.getTotalServidas());
    }
}
