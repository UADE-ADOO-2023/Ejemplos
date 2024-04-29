package ar.edu.uade.adoo.ejemplos.clase6;
import java.io.*;
import java.util.*;

/**
 *
 */
public abstract class Sujeto {

    /**
     * Default constructor
     */
    public Sujeto() {
        this.observers = new ArrayList<>();
    }

    /**
     *
     */
    protected List<Observer> observers;


    /**
     * @param observer
     */
    public void agregar(Observer observer) {
        observers.add(observer);
    }

    /**
     * @param observer
     */
    public void eliminar(Observer observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    public void notificar() {
        for (Observer observer:observers) {
            observer.actualizar(this);
        }
    }

}
