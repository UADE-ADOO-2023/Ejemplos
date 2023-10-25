package ar.edu.uade.adoo.ejemplos.clase11;

public abstract class Producto {
    private Float precioBase;

    public abstract Float getPrecio();

    public abstract void agregarProducto(Producto producto);
}
