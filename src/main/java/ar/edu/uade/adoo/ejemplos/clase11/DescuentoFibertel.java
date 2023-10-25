package ar.edu.uade.adoo.ejemplos.clase11;

public class DescuentoFibertel extends Descuento{
    public DescuentoFibertel(Producto servicio) {
        super(servicio);
    }

    @Override
    public Float getPrecio() {
        return servicio.getPrecio() * 0.5F;
    }

    @Override
    public void agregarProducto(Producto producto) {

    }

    public Producto getServicio() {
        return this.servicio;
    }
}
