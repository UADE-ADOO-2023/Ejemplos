package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public class HotSale extends Descuento {
    public HotSale(Precio precio) {
        super(precio);
    }

    @Override
    public Float calcularTotal() {
        return (float)(super.calcularTotal() * 0.9);
    }
}
