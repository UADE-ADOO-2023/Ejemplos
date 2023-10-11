package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public class Cupon extends Descuento{
    public Cupon(Precio precio) {
        super(precio);
    }

    @Override
    public Float calcularTotal() {
        return (float)(super.calcularTotal() * 0.95);
    }

}
