package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public abstract class FactoryImpuesto {

    /**
     * Default constructor
     */
    public FactoryImpuesto() {
    }

    /**
     * @param paisOrigen
     * @return
     */
    public abstract List<Impuesto> crearImpuestos();

}
