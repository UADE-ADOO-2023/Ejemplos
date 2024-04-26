package ar.edu.uade.adoo.ejemplos.clase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 */
public class ModuloFiltrado {

    /**
     * Default constructor
     */
    public ModuloFiltrado() {
    }

    /**
     * @param path
     * @return
     */
    public String filtrarMensajesArchivo(String path) {
        List<Mensaje> mensajes = GestorArchivos.getInstancia().leerArchivo(path);
        Cadena cadena = new Cadena();
        for (Mensaje mensaje:mensajes) {
            cadena.filtrar(mensaje);
        }
        return "";
    }

}
