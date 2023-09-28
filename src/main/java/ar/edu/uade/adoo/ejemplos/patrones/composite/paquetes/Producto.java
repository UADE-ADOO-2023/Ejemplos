package ar.edu.uade.adoo.ejemplos.patrones.composite.paquetes;

public class Producto implements Pedido{
    private String nombre;
    private Float precio;

    public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Float getTotal() {
        return precio;
    }

    @Override
    public void agregarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Los productos no pueden contener pedidos");
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
