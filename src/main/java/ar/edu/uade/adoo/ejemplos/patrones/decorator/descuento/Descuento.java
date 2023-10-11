package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public abstract class Descuento implements Precio{
    private Precio precio;

    public Descuento(Precio precio) {
        this.precio = precio;
    }

    @Override
    public Float calcularTotal() {
        return precio.calcularTotal();
    }
}
