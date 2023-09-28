package ar.edu.uade.adoo.ejemplos.patrones.adapter.formas;

public class DragDropHandle implements IHandle {
    @Override
    public void mover(IForma elemento, int x, int y) {
        System.out.printf("Arrastro elemento %s a posicion (%d, %d)\n", elemento.getNombre(), x, y);
    }
}
