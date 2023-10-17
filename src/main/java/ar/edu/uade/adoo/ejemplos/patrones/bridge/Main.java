package ar.edu.uade.adoo.ejemplos.patrones.bridge;

public class Main {
    public static void main(String[] args) {
        Dificultad facil = new Dificil();
        Jugador ana = new PC(facil);
        ana.generarEnemigos();
    }
}
