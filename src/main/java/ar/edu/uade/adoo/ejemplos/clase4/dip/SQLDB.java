package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class SQLDB {
    public void guardarEnDB(List<Articulo> articulos) {
        for (Articulo articulo : articulos) {
            System.out.println("Guardando en DB: " + articulo.getNombre());
        }
    }
}
