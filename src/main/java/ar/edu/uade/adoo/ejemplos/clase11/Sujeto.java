package ar.edu.uade.adoo.ejemplos.clase11;

import java.util.LinkedList;
import java.util.List;

public abstract class Sujeto {
    private List<Observer> observadores;

    public Sujeto() {
        this.observadores = new LinkedList<>();
    }

    public void agregarObservador(Observer observer) {
        this.observadores.add(observer);
    }

    public void notificar() {
        this.observadores.forEach(observer -> observer.actualizar(this));
    }
}
