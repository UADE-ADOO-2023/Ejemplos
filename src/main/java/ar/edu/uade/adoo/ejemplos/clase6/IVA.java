package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class IVA extends Impuesto {

    /**
     * Default constructor
     */
    public IVA() {
        this.valor = 0.21f;
    }

    /**
     *
     */
    private boolean exento;

    /**
     * @param precioBase
     * @return
     */
    public Float getValorTotal(Float precioBase) {
        if (exento) {
            return precioBase;
        }
        return (1 + this.valor) + precioBase;
    }

}
