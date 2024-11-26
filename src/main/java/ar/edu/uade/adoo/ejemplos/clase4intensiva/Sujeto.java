package ar.edu.uade.adoo.ejemplos.clase4intensiva;
import java.util.*;

/**
 *
 */
public abstract class Sujeto {

    /**
     * Default constructor
     */
    public Sujeto() {
        this.observadores = new ArrayList<>();
    }

    /**
     *
     */
    private List<Observador> observadores;

    /**
     * @param o
     */
    public void agregarObservador(Observador o) {
        this.observadores.add(o);
    }

    /**
     * @param o
     */
    public void eliminarObservador(Observador o) {
        this.observadores.remove(o);
    }

    /**
     *
     */
    public void notificarObservadores() {
        for (Observador o: observadores) {
            o.actualizar(this);
        }
    }

}
