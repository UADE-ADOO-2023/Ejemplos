package ar.edu.uade.adoo.ejemplos.patrones.adapter.formas;

public interface IForma {
    String getNombre();
    int obtenerAreaContenedora();
    IHandle obtenerHandle();
}
