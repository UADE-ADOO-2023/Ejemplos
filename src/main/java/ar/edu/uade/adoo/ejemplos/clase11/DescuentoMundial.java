package ar.edu.uade.adoo.ejemplos.clase11;

public class DescuentoMundial extends Descuento{
    public DescuentoMundial(Producto servicio) {
        super(servicio);
    }

    @Override
    public void agregarProducto(Producto producto) {

    }

    @Override
    public Float getPrecio() {
        return servicio.getPrecio() * 0.9F;
    }
}
