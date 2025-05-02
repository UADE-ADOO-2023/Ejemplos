package ar.edu.uade.adoo.ejemplos.clase7;

/**
 *
 */
public class Producto extends Item {

    /**
     * Default constructor
     */
    public Producto() {
    }

    public Producto(String descipcion, Float precio) {
        this.descipcion = descipcion;
        this.precio = precio;
    }

    private String descipcion;

    /**
     *
     */
    private Float precio;

    /**
     *
     */
    private Integer stock;

    /**
     * @return
     */
    public Float calcularPrecio() {
        return precio;
    }

    @Override
    public void agregarItem(Item item) {
        throw new UnsupportedOperationException("No se pueden agregar items a un producto");
    }

}
