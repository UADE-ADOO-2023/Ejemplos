package ar.edu.uade.adoo.ejemplos.clase5;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Privacidad extends Filtro {
    private static final List<String> CONTENIDO_SENSIBLE = Arrays.asList("cvv");

    /**
     * Default constructor
     */
    public Privacidad() {
    }

    /**
     * @param mensaje
     */
    public void filtrar(Mensaje mensaje) {
        if (mensaje.tienePalabras(CONTENIDO_SENSIBLE)) {
            mensaje.setContenido("");
        } else if (siguiente != null) {
            siguiente.filtrar(mensaje);
        }
    }

}
