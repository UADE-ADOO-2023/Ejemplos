package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class Producto {

    public Producto(Float precio, List<Impuesto> impuestos, String nombre, Pais origen) {
        this.id = 1;
        this.precio = precio;
        this.impuestos = impuestos;
        this.nombre = nombre;
        this.origen = origen;
    }

    /**
     *
     */
    private Float precio;

    /**
     *
     */
    private List<Impuesto> impuestos;

    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private Pais origen;

    /**
     *
     */
    private Integer id;





    /**
     * @return
     */
    public Float getPrecio() {
        Float totalImpuestos = 0f;
        for (Impuesto impuesto: impuestos) {
            totalImpuestos += impuesto.getValorTotal(this.precio);
        }
        return totalImpuestos;
    }

    public boolean esProducto(Integer idProducto) {
        return this.id.equals(idProducto);
    }

    public Integer getId() {
        return id;
    }
}
