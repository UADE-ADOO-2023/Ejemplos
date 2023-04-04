package ar.edu.uade.adoo.ejemplos.clase4.dip;

import java.util.List;

public class Compra {
    private IPersistencia db;
    private IMetodoPago metodoPago;

    public Compra(IPersistencia db, IMetodoPago metodoPago) {
        this.db = db;
        this.metodoPago = metodoPago;
    }

    public void guardarArticulos(List<Articulo> articulos) {
        this.db.guardarEnDB(articulos);
    }

    public void comprarArticulos(List<Articulo> articulos) {
        Carrito carrito = new Carrito();
        carrito.comprar(articulos);
        this.metodoPago.pagarCompra(articulos);
    }
}
