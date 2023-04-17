package ar.edu.uade.adoo.ejemplos.patrones.state;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reproductor {
    private Estado estado;
    private Boolean reproduciendo;
    private List<String> listaReproduccion;
    private Integer cancionActual;

    public Reproductor() {
        this.estado = new EstadoListo(this);
        this.reproduciendo = false;
        this.listaReproduccion = IntStream.rangeClosed(0, 10).boxed().map(numero -> String.format("Cancion %d", numero)).collect(Collectors.toList());
        this.cancionActual = 0;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setReproduciendo(Boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public Boolean getReproduciendo() {
        return reproduciendo;
    }


    public void reproducir() {
        System.out.println("Reproduciendo " + this.listaReproduccion.get(this.cancionActual));
    }

    public void siguiente() {
        if (this.cancionActual + 1 >= this.listaReproduccion.size()) {
            this.cancionActual = 0;
        } else {
            this.cancionActual++;
        }
        this.reproducir();
    }

    public void anterior() {
        if (this.cancionActual - 1 < 0) {
            this.cancionActual = this.listaReproduccion.size();
        }
        this.cancionActual--;
        this.reproducir();
    }
}
