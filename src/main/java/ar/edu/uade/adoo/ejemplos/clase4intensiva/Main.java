package ar.edu.uade.adoo.ejemplos.clase4intensiva;

import java.util.Arrays;

public class Main {
    public static void main(String []args) {
        Producto celular = new ProductoElectronico(0.2f, "Celular", 1000000f, "Rumania");
        Producto lavavajillas = new ProductoHogar(0.1f, "Lava", 5000000f, false);

        LineaVenta linea1 = new LineaVenta(celular, 1);
        LineaVenta linea2 = new LineaVenta(lavavajillas, 1);

        Venta venta = new Venta(Arrays.asList(linea1, linea2));

        Observador oficinaContable = new OficinaContable();
        Observador deposito = new Deposito();
        Observador contadorVentas = new ContadorVentas();

        venta.agregarObservador(oficinaContable);
        venta.agregarObservador(deposito);
        venta.agregarObservador(contadorVentas);

        venta.finalizarVenta();
    }
}
