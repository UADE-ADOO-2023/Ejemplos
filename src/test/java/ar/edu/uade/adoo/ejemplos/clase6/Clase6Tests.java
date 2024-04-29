package ar.edu.uade.adoo.ejemplos.clase6;


import ar.edu.uade.adoo.ejemplos.clase5.ModuloFiltrado;
import org.junit.Test;

import java.util.List;

public class Clase6Tests {
    @Test
    public void clase5Test() {
        // Given
        ControllerProducto controllerProducto = new ControllerProducto();
        controllerProducto.crearProducto("Argentina", "Heladera", 500000f);
        ControllerVentas controllerVentas = new ControllerVentas(controllerProducto);
        // When
        controllerVentas.crearVenta(List.of(1));
    }
}
