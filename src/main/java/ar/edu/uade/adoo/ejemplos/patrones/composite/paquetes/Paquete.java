package ar.edu.uade.adoo.ejemplos.patrones.composite.paquetes;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Pedido {
    private List<Pedido> pedidos;
    private Float precioPaquete;

    public Paquete(Float precioPaquete) {
        this.pedidos = new ArrayList<>();
        this.precioPaquete = precioPaquete;
    }


    @Override
    public Float getTotal() {
        double total = this.pedidos.stream().mapToDouble(Pedido::getTotal).sum();
        return (float) total + this.precioPaquete;
    }

    @Override
    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
