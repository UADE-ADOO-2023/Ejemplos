package ar.edu.uade.adoo.ejemplos.patrones.composite.paquetes;

public interface Pedido {
    Float getTotal();
    void agregarPedido(Pedido pedido);
}
