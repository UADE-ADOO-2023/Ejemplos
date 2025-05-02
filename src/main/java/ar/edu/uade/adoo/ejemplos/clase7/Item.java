package ar.edu.uade.adoo.ejemplos.clase7;

/**
 *
 */
public abstract class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * @return
     */
    public abstract Float calcularPrecio();
    public abstract void agregarItem(Item item);

}
