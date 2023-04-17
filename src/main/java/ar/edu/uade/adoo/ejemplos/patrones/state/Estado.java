package ar.edu.uade.adoo.ejemplos.patrones.state;

public abstract class Estado {
    protected Reproductor reproductor;

    public Estado(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    public abstract void bloquear();
    public abstract void reproducir();
    public abstract void siguiente();
    public abstract void anterior();
}
