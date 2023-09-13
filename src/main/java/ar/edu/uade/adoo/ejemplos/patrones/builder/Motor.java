package ar.edu.uade.adoo.ejemplos.patrones.builder;

public abstract class Motor {
    private int caballosFuerza;

    public Motor(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public abstract void encender();

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "caballosFuerza=" + caballosFuerza +
                '}';
    }
}
