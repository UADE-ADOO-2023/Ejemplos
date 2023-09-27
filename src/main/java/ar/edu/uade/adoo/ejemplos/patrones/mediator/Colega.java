package ar.edu.uade.adoo.ejemplos.patrones.mediator;

public abstract class Colega {
    protected Mediador mediador;

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }
}
