package ar.edu.uade.adoo.ejemplos.patrones.adapter.formas;

public class TextoHandle implements IHandle{
    @Override
    public void mover(IForma elemento, int x, int y) {
        System.out.printf("Muevo texto %s a posicion (%d, %d)\n", elemento.getNombre(), x, y);
    }
}
