package ar.edu.uade.adoo.ejemplos.clase5;


import org.junit.Test;

public class Clase5Tests {
    @Test
    public void clase5Test() {
        // Given
        String path = "C:\\Users\\ana\\Documents\\UADE\\ADOO\\2023\\Ejemplos\\src\\main\\resources\\texto.txt";
        ModuloFiltrado modulo = new ModuloFiltrado();
        // When
        modulo.filtrarMensajesArchivo(path);
        // Then
    }
}
