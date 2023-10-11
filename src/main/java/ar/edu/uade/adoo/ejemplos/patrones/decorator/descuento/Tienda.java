package ar.edu.uade.adoo.ejemplos.patrones.decorator.descuento;

public class Tienda {
    public static void main(String [] args) {
        Precio computadora = new Producto("Compu", 1000F);

        Precio hotSale = new HotSale(computadora);
        System.out.println(hotSale.calcularTotal());

        Precio transferencia = new Transferencia(hotSale);
        System.out.println(transferencia.calcularTotal());

        Precio transferencia2 = new Transferencia(transferencia);
        System.out.println(transferencia2.calcularTotal());
    }
}
