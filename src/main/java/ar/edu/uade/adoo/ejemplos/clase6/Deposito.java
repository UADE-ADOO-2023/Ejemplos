package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class Deposito implements Observer {

    /**
     * Default constructor
     */
    public Deposito() {
    }

    /**
     * @param sujeto
     */
    public void actualizar(Sujeto sujeto) {
        List<Producto> productosAPrepara = ((Venta)sujeto).getProductos();
    }

}
