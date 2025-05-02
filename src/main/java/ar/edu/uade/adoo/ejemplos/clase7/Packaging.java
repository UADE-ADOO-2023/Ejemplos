package ar.edu.uade.adoo.ejemplos.clase7;

/**
 *
 */
public class Packaging extends Decorado {

    /**
     * Default constructor
     */
    public Packaging(Item item, Float precioExtra) {
        super(item);
        this.precioExtra = precioExtra;
    }

    /**
     *
     */
    private Float precioExtra;

    /**
     * @return
     */
    public Float calcularPrecio() {
        return item.calcularPrecio() + precioExtra;
    }

    @Override
    public void agregarItem(Item item) {
        throw new UnsupportedOperationException("No se pueden agregar items a un packaging");
    }

}
