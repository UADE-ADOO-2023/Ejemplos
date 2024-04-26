package ar.edu.uade.adoo.ejemplos.clase5;

/**
 *
 */
public class Cadena {

    /**
     * Default constructor
     */
    public Cadena() {
        Filtro spam = new Spam();
        Filtro contenido = new Contenido();
        Filtro privacidad = new Privacidad();
        contenido.setSiguiente(privacidad);
        privacidad.setSiguiente(spam);
        this.filtro = contenido;
    }

    /**
     *
     */
    private Filtro filtro;

    /**
     * @param mensaje
     */
    public void filtrar(Mensaje mensaje) {
        this.filtro.filtrar(mensaje);
    }

}
