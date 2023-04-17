package ar.edu.uade.adoo.ejemplos.patrones.state;

public class EstadoBloqueado extends Estado {
    public EstadoBloqueado(Reproductor reproductor) {
        super(reproductor);
        reproductor.setReproduciendo(false);
    }

    @Override
    public void bloquear() {
        if(reproductor.getReproduciendo()) {
            reproductor.setEstado(this);
            System.out.println("Reproduccion detenida");
        } else {
            System.out.println("Reproductor bloqueado");
        }
    }

    @Override
    public void reproducir() {
        reproductor.setEstado(new EstadoListo(reproductor));
        System.out.println("Reproductor listo");
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
