package ar.edu.uade.adoo.ejemplos.patrones.adapter;

public interface IForma {
    String getNombre();
    int obtenerAreaContenedora();
    IHandle obtenerHandle();
}
