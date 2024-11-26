package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public abstract class Producto {

    public Producto(Float impuesto, String descripcion, Float precio) {
        this.impuesto = impuesto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     *
     */
    protected Float impuesto;

    /**
     *
     */
    private String descripcion;

    /**
     *
     */
    protected Float precio;

    /**
     * @return
     */
    public abstract Float getPrecio();

}
