package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public interface IPersistencia {
    void guardarEnDB(List<Articulo> articulos);
}
