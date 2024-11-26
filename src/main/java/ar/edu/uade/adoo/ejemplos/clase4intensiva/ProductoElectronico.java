package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class ProductoElectronico extends Producto {

    public ProductoElectronico(Float impuesto, String descripcion, Float precio, String paisOrigen) {
        super(impuesto, descripcion, precio);
        this.paisOrigen = paisOrigen;
    }

    /**
     *
     */
    private String paisOrigen;

    /**
     * @return
     */
    public Float getPrecio() {
        return super.precio + (precio*impuesto);
    }


}
