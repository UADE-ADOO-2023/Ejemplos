package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class Contador implements Observer {
    private Integer cantidadVentas = 0;

    /**
     * Default constructor
     */
    public Contador() {
        this.controlCruzado = new ControlCruzado();
    }

    /**
     *
     */
    private ControlCruzado controlCruzado;


    /**
     * @param sujeto
     */
    public void actualizar(Sujeto sujeto) {
        cantidadVentas++;
        List<Integer> idProductos = ((Venta)sujeto).getIDsProducto();
        for (Integer idProducto:idProductos) {
            controlCruzado.control(idProducto);
        }
    }


}
