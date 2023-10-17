package ar.edu.uade.adoo.ejemplos.patrones.bridge;

public abstract class Jugador {
    private Dificultad dificultad;

    public Jugador(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public void generarEnemigos() {
        for (int i = 0; i < this.dificultad.getCantidadEnemigos(); i++) {
            crearEnemigo();
        }
    }

    protected abstract void crearEnemigo();
}
