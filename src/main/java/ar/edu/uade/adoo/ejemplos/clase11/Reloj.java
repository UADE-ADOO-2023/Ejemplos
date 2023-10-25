package ar.edu.uade.adoo.ejemplos.clase11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reloj extends Sujeto{
    private LocalDate fecha;

    public Reloj () {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                verificarFecha();
            }
        };
        task.run();
    }

    private void verificarFecha() {
        while (true) {
            if (LocalDate.now().minus(60, ChronoUnit.MINUTES).isAfter(this.fecha)) {
                this.fecha = LocalDate.now();
                this.notificar();
            }
        }

    }

    public LocalDate getFecha() {
        return fecha;
    }
}


