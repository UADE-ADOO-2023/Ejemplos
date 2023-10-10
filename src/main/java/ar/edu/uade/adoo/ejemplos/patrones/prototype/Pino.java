package ar.edu.uade.adoo.ejemplos.patrones.prototype;

public class Pino extends Arbol{
    public Pino(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    public Arbol copiar() {
        return new Pino(this.posicionX, this.posicionY);
    }
}
