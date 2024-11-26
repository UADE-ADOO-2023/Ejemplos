package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public class OficinaContable implements Observador {

    /**
     * Default constructor
     */
    public OficinaContable() {
    }

    /**
     *
     */
    private Float totalVentas = 0f;

    /**
     * @param sujeto
     */
    @Override
    public void actualizar(Sujeto sujeto) {
        if (sujeto instanceof Venta) {
            totalVentas += ((Venta) sujeto).calcularMonto();
        }
    }
}
