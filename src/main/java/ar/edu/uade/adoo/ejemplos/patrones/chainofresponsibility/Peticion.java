package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class Peticion {
    private TipoPeticion tipo;
    private String descripcion;

    public Peticion(TipoPeticion tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esDeTipo(TipoPeticion tipo) {
        return this.tipo.equals(tipo);
    }
}
