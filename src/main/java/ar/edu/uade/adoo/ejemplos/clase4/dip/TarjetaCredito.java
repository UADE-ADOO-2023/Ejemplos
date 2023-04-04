package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class TarjetaCredito implements IMetodoPago {
    public void pagarCompra(List<Articulo> articulos) {
        for (Articulo articulo : articulos) {
            System.out.println("Pagando articulo: " + articulo.getNombre());
        }
    }
}
