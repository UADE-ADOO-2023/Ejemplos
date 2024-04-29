package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class FactoryImpuestoNacional extends FactoryImpuesto {

    /**
     * Default constructor
     */
    public FactoryImpuestoNacional() {
    }

    /**
     * @return
     */
    public List<Impuesto> crearImpuestos() {
        return List.of(new IVA());
    }
}
