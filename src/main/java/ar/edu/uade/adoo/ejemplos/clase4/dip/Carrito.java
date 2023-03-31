package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class Carrito {
    public void comprar(List<Articulo> articulos) {
        for (Articulo articulo : articulos) {
            System.out.println("Pasando por registradora: " + articulo.getNombre());
        }
    }
}
