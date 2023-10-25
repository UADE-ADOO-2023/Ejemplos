package ar.edu.uade.adoo.ejemplos.patrones.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ArbolFactory {
    private List<EspecieArbol> arboles;

    public ArbolFactory() {
        this.arboles = new ArrayList<>();
    }

    public EspecieArbol getArbol(String especie) {
        EspecieArbol especieArbolABuscar = new EspecieArbol(especie);
        int posicionEspecieBuscada = arboles.indexOf(especieArbolABuscar);
        if (posicionEspecieBuscada != -1)
            return arboles.get(posicionEspecieBuscada);
        else {
            this.arboles.add(especieArbolABuscar);
            return especieArbolABuscar;
        }
    }

    public int getCantidadEspecies() {
        return this.arboles.size();
    }
}
