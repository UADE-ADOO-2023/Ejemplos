package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
public class Venta extends Sujeto {

    /**
     * Default constructor
     */
    public Venta(List<LineaVenta> items) {
        this.items = items;
    }

    /**
     *
     */
    private List<LineaVenta> items;

    /**
     * @return
     */
    public Float calcularMonto() {
        return (float) items.stream().mapToDouble(producto -> producto.getProducto().getPrecio()).sum();
    }

    /**
     * @return
     */
    public List<Producto> getProductos() {
        return items.stream().map(LineaVenta::getProducto).collect(Collectors.toList());
    }

    public void finalizarVenta() {
        this.notificarObservadores();
    }

}
