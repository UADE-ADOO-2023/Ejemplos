package ar.edu.uade.adoo.ejemplos.patrones.state;

public class EstadoListo extends Estado {
    public EstadoListo(Reproductor reproductor) {
        super(reproductor);
    }

    @Override
    public void bloquear() {
        reproductor.setEstado(new EstadoBloqueado(reproductor));
        System.out.println("Reproductor bloqueado");
    }

    @Override
    public void reproducir() {
        reproductor.setEstado(new EstadoReproduciendo(reproductor));
        reproductor.reproducir();
    }

    @Override
    public void siguiente() {
        System.out.println("Reproductor bloqueado");
    }

    @Override
    public void anterior() {
        System.out.println("Reproductor bloqueado");
    }
}
