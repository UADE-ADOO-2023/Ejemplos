package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class FactoryImpuestoImportado extends FactoryImpuesto {

    /**
     * Default constructor
     */
    public FactoryImpuestoImportado() {
    }

    /**
     * @return
     */
    public List<Impuesto> crearImpuestos() {
        return List.of(new ImpuestoPais(), new Ganancias());
    }


}
