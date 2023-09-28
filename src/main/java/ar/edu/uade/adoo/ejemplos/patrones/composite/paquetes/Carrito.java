package ar.edu.uade.adoo.ejemplos.patrones.composite.paquetes;

public class Carrito {
    private Pedido pedido;

    public Carrito() {
        this.pedido = new Paquete(0f);
    }

    public void agregarPedido(Pedido pedido) {
        this.pedido.agregarPedido(pedido);
    }

    public float getTotal() {
        return this.pedido.getTotal();
    }
}
