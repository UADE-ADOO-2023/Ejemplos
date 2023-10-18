package ar.edu.uade.adoo.ejemplos.patrones.memento;

import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Memento crearMemento() {
        return new Memento(this.fecha);
    }

    public void restaurarDesdeMemento(Memento memento) {
        this.fecha = memento.getFecha();
    }

    @Override
    public String toString() {
        return fecha.toString();
    }

    public void adicionarDia() {
        this.fecha = this.fecha.plusDays(1L);
    }

}
