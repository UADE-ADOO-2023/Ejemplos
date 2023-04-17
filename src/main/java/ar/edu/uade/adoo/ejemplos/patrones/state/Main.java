package ar.edu.uade.adoo.ejemplos.patrones.state;

public class Main {
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();
        reproductor.getEstado().reproducir();
        reproductor.getEstado().siguiente();
        reproductor.getEstado().bloquear();
        reproductor.getEstado().siguiente();
        reproductor.getEstado().reproducir();
        reproductor.getEstado().reproducir();
        reproductor.getEstado().anterior();
    }
}
