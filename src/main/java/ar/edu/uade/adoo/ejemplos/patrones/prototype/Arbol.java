package ar.edu.uade.adoo.ejemplos.patrones.prototype;

public abstract class Arbol {
    protected int posicionX;
    protected int posicionY;

    public Arbol(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public abstract Arbol copiar();

    public Boolean enMismaPosicion(Arbol arbol) {
        return this.posicionX == arbol.getPosicionX() && this.posicionY == arbol.getPosicionY();
    }
}
