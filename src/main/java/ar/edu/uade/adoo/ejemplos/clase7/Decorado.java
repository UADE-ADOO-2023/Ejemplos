package ar.edu.uade.adoo.ejemplos.clase7;

/**
 *
 */
public abstract class Decorado extends Item {

    /**
     * Default constructor
     */
    public Decorado(Item item) {
        this.item = item;
    }

    /**
     *
     */
    protected Item item;

    /**
     * @return
     */
    public abstract Float calcularPrecio();

}
