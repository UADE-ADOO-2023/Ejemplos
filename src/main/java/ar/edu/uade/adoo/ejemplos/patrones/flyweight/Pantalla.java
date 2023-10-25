package ar.edu.uade.adoo.ejemplos.patrones.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Pantalla {
    private List<Arbol> arboles;
    private ArbolFactory factory;

    public Pantalla() {
        this.arboles = new ArrayList<>();
        this.factory = new ArbolFactory();
    }

    public void agregarArbol(String especie, int posicionX, int posicionY) {
        EspecieArbol especieArbol = this.factory.getArbol(especie);
        Arbol arbol = new Arbol(posicionX, posicionY, especieArbol);
        this.arboles.add(arbol);
    }

    public void renderizar() {
        for (Arbol arbol: this.arboles) {
            arbol.dibujar();
        }
    }

    public int getCantidadArbolesRenderizados() {
        return this.arboles.size();
    }

    public int getCantidadEspecies() {
        return this.factory.getCantidadEspecies();
    }
}
