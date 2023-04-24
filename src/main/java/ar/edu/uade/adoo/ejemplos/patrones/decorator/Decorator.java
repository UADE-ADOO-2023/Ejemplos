package ar.edu.uade.adoo.ejemplos.patrones.decorator;

public class Decorator extends ComponenteVisual {
    private ComponenteVisual componenteVisual;

    public Decorator(ComponenteVisual componenteVisual) {
        this.componenteVisual = componenteVisual;
    }

    @Override
    public void dibujar() {
        this.componenteVisual.dibujar();
    }
}
