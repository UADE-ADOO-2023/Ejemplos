package ar.edu.uade.adoo.ejemplos.clase7;

/**
 *
 */
public class Descuento extends Decorado {
    private Float descuento;

    /**
     * Default constructor
     */
    public Descuento(Item item, Float descuento) {
        super(item);
        this.descuento = descuento;
    }

    /**
     * @return
     */
    public Float calcularPrecio() {
        return item.calcularPrecio() * (1 - descuento);
    }

    @Override
    public void agregarItem(Item item) {
        throw new UnsupportedOperationException("No se pueden agregar items a un descuento");
    }

}
