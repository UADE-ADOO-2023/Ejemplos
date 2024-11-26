package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class Deposito implements Observador {

    /**
     * Default constructor
     */
    public Deposito() {
    }

    /**
     * @param sujeto
     */
    @Override
    public void actualizar(Sujeto sujeto) {
        if (sujeto instanceof Venta) {
            System.out.println(((Venta)sujeto).getProductos());
        }
    }


}
