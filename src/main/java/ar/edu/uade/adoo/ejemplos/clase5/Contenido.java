package ar.edu.uade.adoo.ejemplos.clase5;

import java.util.List;

/**
 *
 */
public class Contenido extends Filtro {

    /**
     * Default constructor
     */
    private static List<String> BLACKLIST = List.of("bet", "download", "torrent");
    public Contenido() {
    }

    /**
     * @param mensaje
     */
    public void filtrar(Mensaje mensaje) {
        if (mensaje.tienePalabras(BLACKLIST)) {
            mensaje.eliminarPalabras(BLACKLIST);
        }
        if (siguiente != null) {
            siguiente.filtrar(mensaje);
        }
    }

}
