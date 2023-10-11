package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public class Transferencia extends Descuento{
    public Transferencia(Precio precio) {
        super(precio);
    }

    @Override
    public Float calcularTotal() {
        return (float)(super.calcularTotal() * 0.8);
    }
}
