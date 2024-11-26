package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class ProductoHogar extends Producto {



    /**
     *
     */
    private Boolean exento;

    public ProductoHogar(Float impuesto, String descripcion, Float precio, Boolean exento) {
        super(impuesto, descripcion, precio);
        this.exento = exento;
    }

    /**
     * @return
     */
    public Float getPrecio() {
        if (exento) {
            return precio;
        }
        return super.precio + (precio*impuesto);
    }

}
