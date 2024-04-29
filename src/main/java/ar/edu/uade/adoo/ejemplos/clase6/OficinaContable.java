package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class OficinaContable implements Observer {

    /**
     * Default constructor
     */
    public OficinaContable() {
    }

    /**
     * @param sujeto
     */
    public void actualizar(Sujeto sujeto) {
        if (sujeto instanceof Venta) {
            Float totalVenta = ((Venta) sujeto).getTotal();
        } else if (sujeto instanceof AFIP) {

        }
    }


}
