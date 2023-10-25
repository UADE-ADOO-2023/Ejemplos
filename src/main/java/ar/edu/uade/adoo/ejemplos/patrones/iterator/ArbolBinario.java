package ar.edu.uade.adoo.ejemplos.patrones.iterator;

public class ArbolBinario {
    private Nodo raiz;

    public int valorRaiz() {
        return raiz.getValor();
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    public void inicializarArbol() {
        raiz = null;
    }

    public ArbolBinario hijoDerecho() {
        return raiz.getHijoDerecho();
    }

    public ArbolBinario hijoIzquierdo() {
        return raiz.getHijoIzquierdo();
    }

    public void agregarElemento(int nuevoValor) {
        /*
         * Primero validamos que el árbol esté vacío. De ser así, lo inicializamos y
         * establecemos el valor en la raíz
         */
        if (this.arbolVacio()) {
            ArbolBinario hijoIzquierdo = new ArbolBinario();
            hijoIzquierdo.inicializarArbol();
            ArbolBinario hijoDerecho = new ArbolBinario();
            hijoDerecho.inicializarArbol();
            raiz = new Nodo(nuevoValor, hijoIzquierdo, hijoDerecho);
        }
        /*
         * Como los valores de un ABB tienen que estar ordenados, evaluamos
         * recursivamente la ubicación en donde el valor debe ser agregado
         */
        else if (raiz.getValor() > nuevoValor) {
            raiz.getHijoIzquierdo().agregarElemento(nuevoValor);
        } else if (raiz.getValor() < nuevoValor) {
            raiz.getHijoDerecho().agregarElemento(nuevoValor);
        }
        /* Si el elemento ya está presente en el árbol, lo ignoramos */
    }

    public void eliminarElemento(int valorAEliminar) {
        if (!this.arbolVacio()) {
            /*
             * Si el nodo que contiene el valor a eliminar es una hoja (no tiene hijos),
             * simplemente lo eliminamos
             */
            if (raiz.getValor() == valorAEliminar && raiz.getHijoIzquierdo().arbolVacio() && raiz.getHijoDerecho().arbolVacio()) {
                raiz = null;
            }
            /*
             * Si el nodo a eliminar tiene un hijo izquierdo no vacío, buscamos el nodo de
             * mayor valor en el subárbol izquierdo y lo reemplazamos en el lugar del nodo a
             * eliminar. El nodo a eliminar ahora es movido a una hoja del subárbol
             * izquierdo, por lo que recursivamente buscamos y eliminamos dicha hoja
             */
            else if (raiz.getValor() == valorAEliminar && !raiz.getHijoIzquierdo().arbolVacio()) {
                raiz.setValor(this.mayor(raiz.getHijoIzquierdo()));
                raiz.getHijoIzquierdo().eliminarElemento(raiz.getValor());
            }
            /*
             * Si el nodo a eliminar tiene un hijo izquierdo vacío, buscamos el nodo de
             * menor valor en el subárbol derecho y lo reemplazamos en el lugar del nodo a
             * eliminar. El nodo a eliminar ahora es movido a una hoja del subárbol derecho,
             * por lo que recursivamente buscamos y eliminamos dicha hoja
             */
            else if (raiz.getValor() == valorAEliminar && raiz.getHijoIzquierdo().arbolVacio()) {
                raiz.setValor(this.menor(raiz.getHijoDerecho()));
                raiz.getHijoDerecho().eliminarElemento(raiz.getValor());
            }
            /*
             * El elemento del nodo actual no es el que queremos eliminar: buscamos en el
             * subárbol derecho o izquierdo dependiendo de si el valor del nodo a
             * eliminar es mayor o menor al del nodo actual respectivamente
             */
            else if (raiz.getValor() < valorAEliminar) {
                raiz.getHijoDerecho().eliminarElemento(valorAEliminar);
            } else {
                raiz.getHijoIzquierdo().eliminarElemento(valorAEliminar);
            }
        }
    }

    /*
     * Buscamos recursivamente el mayor valor de un árbol, siempre explorando los
     * hijos a la derecha
     */
    private int mayor(ArbolBinario arbol) {
        if (arbol.hijoDerecho().arbolVacio()) {
            return arbol.valorRaiz();
        } else {
            return mayor(arbol.hijoDerecho());
        }
    }

    /*
     * Buscamos recursivamente el menor valor de un árbol, siempre explorando los
     * hijos a la izquierda
     */
    private int menor(ArbolBinario arbol) {
        if (arbol.hijoIzquierdo().arbolVacio()) {
            return arbol.valorRaiz();
        } else {
            return menor(arbol.hijoIzquierdo());
        }
    }

    public ArbolIterator crearPreOrderIterator() {
        return new PreOrderIterator(this);
    }

    public ArbolIterator crearInOrderIterator() {
        return new InOrderIterator(this);
    }

    public ArbolIterator crearPostOrderIterator() {
        return new PostOrderIterator(this);
    }
}