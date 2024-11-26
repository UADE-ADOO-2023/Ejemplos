package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class LineaVenta {

    public LineaVenta(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     *
     */
    private Producto producto;

    /**
     *
     */
    private Integer cantidad;

    /**
     * @return
     */
    public Producto getProducto() {
        // TODO implement here
        return producto;
    }

}
