package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public class Ganancias extends Impuesto {

    /**
     * Default constructor
     */
    public Ganancias() {
        this.valor = 0.35f;
    }

    /**
     * @param precioBase
     * @return
     */
    public Float getValorTotal(Float precioBase) {
        return (1 + this.valor) + precioBase;
    }


}
