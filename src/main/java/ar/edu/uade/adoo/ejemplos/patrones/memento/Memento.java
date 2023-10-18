package ar.edu.uade.adoo.ejemplos.patrones.memento;

import java.time.LocalDate;

class Memento {
    private LocalDate fecha;

    public Memento(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}