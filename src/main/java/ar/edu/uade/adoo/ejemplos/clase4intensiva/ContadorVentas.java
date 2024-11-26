package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class ContadorVentas implements Observador {

    /**
     * Default constructor
     */
    public ContadorVentas() {
    }

    /**
     *
     */
    public Integer cantidadVentas = 0;

    /**
     * @param sujeto
     */
    @Override
    public void actualizar(Sujeto sujeto) {
        if (sujeto instanceof Venta) {
            cantidadVentas+=1;
        }
    }


}
