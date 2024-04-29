package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
public class Venta extends Sujeto {

    public Venta(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     *
     */
    private List<Producto> productos;

    /**
     * @return
     */
    public Float getTotal() {
        Float totalVenta = 0f;
        for (Producto producto:productos) {
            totalVenta += producto.getPrecio();
        }
        return totalVenta;
    }

    /**
     * @return
     */
    public List<Producto> getProductos() {
        return this.productos;
    }

    /**
     * @return
     */
    public List<Integer> getIDsProducto() {
        List<Integer> ids = new ArrayList<>();
        for (Producto producto:productos) {
            ids.add(producto.getId());
        }
        return ids;
    }

}
