package ar.edu.uade.adoo.ejemplos.patrones.prototype;

public class Araucaria extends Arbol{
    public Araucaria(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    public Arbol copiar() {
        return new Araucaria(this.posicionX, this.posicionY);
    }
}
