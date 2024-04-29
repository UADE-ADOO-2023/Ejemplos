package ar.edu.uade.adoo.ejemplos.clase6;

import java.util.List;

// Mejor seria la aplicacion del patron Builder
public class FactoryVenta {
    public static Venta crearVenta(List<Producto> productos) {
        Observer oficinaContable = new OficinaContable();
        AFIP afip = new AFIP();
        Venta venta = new Venta(productos);
        venta.agregar(new Contador());
        venta.agregar(new Deposito());
        venta.agregar(oficinaContable);
        afip.agregar(oficinaContable);
        venta.notificar();
        afip.subirImpuesto();
        return venta;
    }
}
