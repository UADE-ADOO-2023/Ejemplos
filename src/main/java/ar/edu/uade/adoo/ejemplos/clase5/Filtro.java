package ar.edu.uade.adoo.ejemplos.clase5;

/**
 *
 */
public abstract class Filtro {

    /**
     * Default constructor
     */
    public Filtro() {
    }

    public void setSiguiente(Filtro siguiente) {
        this.siguiente = siguiente;
    }

    /**
     *
     */
    protected Filtro siguiente;

    /**
     * @param mensaje
     */
    public abstract void filtrar(Mensaje original);

}
