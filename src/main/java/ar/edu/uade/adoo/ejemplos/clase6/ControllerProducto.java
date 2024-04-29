package ar.edu.uade.adoo.ejemplos.clase6;

import java.util.*;

/**
 *
 */
public class ControllerProducto {
    private List<Producto> productos;

    /**
     * Default constructor
     */
    public ControllerProducto() {
        this.productos = new ArrayList<>();
    }




    /**
     * @param paisOrigen
     * @param nombre
     * @param precio
     */
    public void crearProducto(String paisOrigen, String nombre, Float precio) {
        FactoryImpuesto factoryImpuesto;
        if (paisOrigen.equalsIgnoreCase("argentina")) {
            factoryImpuesto = new FactoryImpuestoNacional();
        } else {
            factoryImpuesto = new FactoryImpuestoImportado();
        }
        List<Impuesto> impuestos = factoryImpuesto.crearImpuestos();
        Producto producto = new Producto(precio, impuestos, nombre, new Pais(paisOrigen));
        this.productos.add(producto);
    }

    /**
     * @param idProducto
     * @return
     */
    public Producto buscarProducto(Integer idProducto) {
        return productos.stream().filter(producto -> producto.esProducto(idProducto)).findFirst().get();
    }

}
