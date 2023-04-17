package ar.edu.uade.adoo.ejemplos.patrones.state;

public class EstadoReproduciendo extends Estado {
    public EstadoReproduciendo(Reproductor reproductor) {
        super(reproductor);
        reproductor.setReproduciendo(true);
    }

    @Override
    public void bloquear() {
        reproductor.setEstado(new EstadoBloqueado(reproductor));
        System.out.println("Reproductor bloqueado");
    }

    @Override
    public void reproducir() {
        reproductor.setEstado(this);
        System.out.println("Reproduciendo");
    }

    @Override
    public void siguiente() {
        reproductor.siguiente();
    }

    @Override
    public void anterior() {
        reproductor.anterior();
    }
}
