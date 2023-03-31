package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class Tienda {
    public static void guardarArticulos(List<Articulo> articulos) {
        SQLDB db = new SQLDB();
        db.guardarEnDB(articulos);
    }

    public static void comprarArticulos(List<Articulo> articulos) {
        Carrito carrito = new Carrito();
        carrito.comprar(articulos);
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.pagarCompra(articulos);
    }
}
