package ar.edu.uade.adoo.ejemplos.clase11;

public abstract class Descuento extends Producto {
    protected Producto servicio;

    public Descuento(Producto servicio) {
        this.servicio = servicio;
    }

    @Override
    public Float getPrecio() {
        return servicio.getPrecio();
    }
}
