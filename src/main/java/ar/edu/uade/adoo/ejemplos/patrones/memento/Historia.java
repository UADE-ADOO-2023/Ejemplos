package ar.edu.uade.adoo.ejemplos.patrones.memento;

import java.util.ArrayList;
import java.util.List;

public class Historia {
    private List<Memento> historia;
    private Fecha fecha;

    public Historia(Fecha fecha) {
        this.fecha = fecha;
        this.historia = new ArrayList<>();
    }

    public void guardarFecha() {
        this.historia.add(this.fecha.crearMemento());
        System.out.println("Guardando fecha: " + this.fecha);
    }

    public void viajarAPrimeraFechaGuardada() {
        this.fecha.restaurarDesdeMemento(this.historia.get(0));
        System.out.println("Viajando en el tiempo. Fecha actual: " + this.fecha);
    }
}
