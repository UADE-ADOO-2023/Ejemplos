package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public class Producto implements Precio {
    private String nombre;
    private Float precioBase;

    public Producto(String nombre, Float precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    @Override
    public Float calcularTotal() {
        return precioBase;
    }
}
