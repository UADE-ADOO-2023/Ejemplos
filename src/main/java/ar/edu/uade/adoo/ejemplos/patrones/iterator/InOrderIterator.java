package ar.edu.uade.adoo.ejemplos.patrones.iterator;

import java.util.LinkedList;
import java.util.Queue;

public class InOrderIterator implements ArbolIterator {
    private Queue<ArbolBinario> cola;

    public InOrderIterator(ArbolBinario arbolActual) {
        this.cola = new LinkedList<>();
        this.recorrer(arbolActual);
    }

    @Override
    public boolean siguiente() {
        return !this.cola.isEmpty();
    }

    @Override
    public ArbolBinario actual() {
        return this.cola.poll();
    }

    private void recorrer(ArbolBinario arbol) {
        if (!arbol.arbolVacio()) {
            recorrer(arbol.hijoIzquierdo());
            this.cola.add(arbol);
            recorrer(arbol.hijoDerecho());
        }
    }
}
