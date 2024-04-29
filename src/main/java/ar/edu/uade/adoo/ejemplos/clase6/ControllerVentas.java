package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class ControllerVentas {
    private ControllerProducto controllerProducto;
    private List<Venta> ventas;

    /**
     * Default constructor
     */
    public ControllerVentas(ControllerProducto controllerProducto) {
        this.controllerProducto = controllerProducto;
        this.ventas = new ArrayList<>();
    }



    /**
     *
     */
    public void crearVenta(List<Integer> idsProducto) {
        List<Producto> productos = new ArrayList<>();
        for (Integer idProducto:idsProducto) {
            productos.add(controllerProducto.buscarProducto(idProducto));
        }
        this.ventas.add(FactoryVenta.crearVenta(productos));
    }

}
