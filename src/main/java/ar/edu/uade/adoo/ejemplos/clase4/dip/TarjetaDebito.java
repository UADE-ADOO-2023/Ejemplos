package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class TarjetaDebito implements IMetodoPago{
    @Override
    public void pagarCompra(List<Articulo> articulos) {
        System.out.println("Pagando con debito");
    }
}
