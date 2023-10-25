package ar.edu.uade.adoo.ejemplos.patrones.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArbolTest {
    @Test
    public void instanciasArbol() {
        // Dado (given)
        Pantalla pantalla = new Pantalla();
        // Cuando (when)
        // Creo 10 instancias de araucarias y 10 instancias de pino (2 especies)
        for (int i = 0; i < 10; i++) {
            pantalla.agregarArbol("Araucaria", i, 0);
        }
        for (int i = 0; i < 10; i++) {
            pantalla.agregarArbol("Pino", i, 0);
        }
        // Entonces (then)
        assertEquals(2, pantalla.getCantidadEspecies());
        assertEquals(20, pantalla.getCantidadArbolesRenderizados());
    }
}
