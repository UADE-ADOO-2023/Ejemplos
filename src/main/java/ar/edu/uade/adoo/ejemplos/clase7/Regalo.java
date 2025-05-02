package ar.edu.uade.adoo.ejemplos.clase7;

public class Regalo extends Decorado{
    /**
     * Default constructor
     *
     * @param item
     */
    public Regalo(Item item) {
        super(item);
    }

    @Override
    public Float calcularPrecio() {
        return item.calcularPrecio();
    }

    @Override
    public void agregarItem(Item item) {
        throw new UnsupportedOperationException("No se pueden agregar items a un regalo");
    }
}
