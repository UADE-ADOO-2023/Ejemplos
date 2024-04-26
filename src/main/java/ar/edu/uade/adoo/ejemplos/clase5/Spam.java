package ar.edu.uade.adoo.ejemplos.clase5;

import java.util.Random;

/**
 *
 */
public class Spam extends Filtro {

    /**
     * Default constructor
     */
    public Spam() {
    }

    /**
     * @param mensaje
     */
    public void filtrar(Mensaje mensaje) {
        if (new Random().nextBoolean()) {
            mensaje.setContenido("");
        } else if (siguiente != null) {
            siguiente.filtrar(mensaje);
        }
    }

}
