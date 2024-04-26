package ar.edu.uade.adoo.ejemplos.clase5;

import java.util.*;

/**
 *
 */
public class Mensaje {

    /**
     * Default constructor
     */
    public Mensaje() {
    }

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String contenido;

    public Mensaje(Integer id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    public boolean tienePalabras(List<String> blacklist) {
        return Arrays.stream(contenido.split(" ")).anyMatch(palabra -> blacklist.contains(palabra));
    }

    public void eliminarPalabras(List<String> blacklist) {
        String[] palabras = contenido.split(" ");
        List<String> palabrasFiltradas = new ArrayList<>();
        for (String palabra : palabras) {
            if (blacklist.contains(palabra)) {
                palabrasFiltradas.add("*");
            } else {
                palabrasFiltradas.add(palabra);
            }
        }
        this.contenido = String.join(" ", palabrasFiltradas);
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
