package ar.edu.uade.adoo.ejemplos.patrones.bridge;

public class PC extends Jugador {
    public PC(Dificultad dificultad) {
        super(dificultad);
    }

    @Override
    protected void crearEnemigo() {
        System.out.println("Creando enemigos PC");
    }
}
