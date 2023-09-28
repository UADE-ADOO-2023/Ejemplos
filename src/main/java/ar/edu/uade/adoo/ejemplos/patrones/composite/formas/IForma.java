package ar.edu.uade.adoo.ejemplos.patrones.composite.formas;

public interface IForma {
    void pintar();

    void agregarFigura(IForma forma);
}
