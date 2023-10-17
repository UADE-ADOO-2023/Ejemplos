package ar.edu.uade.adoo.ejemplos.patrones.memento;

import ar.edu.uade.adoo.ejemplos.patrones.memento.Fecha;
import ar.edu.uade.adoo.ejemplos.patrones.memento.Historia;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class MementoTest {
    @Test
    public void mementoTest() {
        // Given
        LocalDate fechaActual = LocalDate.now();
        Fecha fecha = new Fecha(fechaActual);
        Historia historia = new Historia(fecha);
        historia.guardarFecha();
        // When
        for (int i = 0; i < 10; i++) {
            fecha.adicionarDia();
            historia.guardarFecha();
        }
        // Then
        assertEquals(fecha.getFecha(), fechaActual.plusDays(10L));
        historia.viajarAPrimeraFechaGuardada();
        assertEquals(fecha.getFecha(), fechaActual);
    }
}
