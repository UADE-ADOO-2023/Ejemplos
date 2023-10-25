package ar.edu.uade.adoo.ejemplos.patrones.iterator;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.inicializarArbol();
        arbol.agregarElemento(50);
        arbol.agregarElemento(17);
        arbol.agregarElemento(72);
        arbol.agregarElemento(76);
        arbol.agregarElemento(54);
        arbol.agregarElemento(67);
        arbol.agregarElemento(12);
        arbol.agregarElemento(23);
        arbol.agregarElemento(9);
        arbol.agregarElemento(19);
        arbol.agregarElemento(14);
        ArbolIterator iterator = arbol.crearPreOrderIterator();
        System.out.println("Preorder");
        while (iterator.siguiente()) {
            System.out.print(iterator.actual().valorRaiz() + " ");
        }
        iterator = arbol.crearInOrderIterator();
        System.out.println();
        System.out.println("Inorder");
        while (iterator.siguiente()) {
            System.out.print(iterator.actual().valorRaiz() + " ");
        }
        iterator = arbol.crearPostOrderIterator();
        System.out.println();
        System.out.println("Postorder");
        while (iterator.siguiente()) {
            System.out.print(iterator.actual().valorRaiz() + " ");
        }
    }
}
