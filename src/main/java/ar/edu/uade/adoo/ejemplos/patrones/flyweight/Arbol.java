package ar.edu.uade.adoo.ejemplos.patrones.flyweight;

public class Arbol {
    private int posicionX;
    private int posicionY;

    private EspecieArbol especie;

    public Arbol(int posicionX, int posicionY, EspecieArbol especie) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.especie = especie;
    }

    public void dibujar() {
        this.especie.dibujarEnPantalla(this.posicionX, this.posicionY);
    }

}
