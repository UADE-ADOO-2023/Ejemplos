package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public abstract class Impuesto {

    /**
     * Default constructor
     */
    public Impuesto() {
    }

    /**
     *
     */
    protected Float valor;


    /**
     * @param precioBase
     * @return
     */
    public abstract Float getValorTotal(Float precioBase);

}
