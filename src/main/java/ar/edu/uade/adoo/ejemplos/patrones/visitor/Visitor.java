package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public interface Visitor {
    void visitar(Asignacion asignacion);
    void visitar(Condicional condicional);
    void visitar(Iteracion iteracion);
}
