package ar.edu.uade.adoo.ejemplos.patrones.decorator;

public class ScrollDecorator extends Decorator {
    public ScrollDecorator(ComponenteVisual componenteVisual) {
        super(componenteVisual);
    }

    public void scroll(int posicionX, int posicionY) {
        System.out.printf("Scrolleando a %d, %d\n", posicionX, posicionY);
    }
}
