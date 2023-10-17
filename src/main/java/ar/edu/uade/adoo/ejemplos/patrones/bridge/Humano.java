package ar.edu.uade.adoo.ejemplos.patrones.bridge;

public class Humano extends Jugador {
    public Humano(Dificultad dificultad) {
        super(dificultad);
    }

    @Override
    protected void crearEnemigo() {
        System.out.println("Buscando jugadores en la red para marcar como enemigos");
    }
}
