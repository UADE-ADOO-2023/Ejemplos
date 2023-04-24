package ar.edu.uade.adoo.ejemplos.patrones.decorator;

public class BordeDecorator extends Decorator {
    private int tamanioBorde;

    public BordeDecorator(ComponenteVisual componenteVisual) {
        super(componenteVisual);
        this.tamanioBorde = 1;
    }

    public void setTamanioBorde(int tamanioBorde) {
        this.tamanioBorde = tamanioBorde;
    }

    @Override
    public void dibujar() {
        super.dibujar();
        this.dibujarBorde();

    }

    public void dibujarBorde() {
        System.out.printf("Dibujando borde de %d pixels\n", this.tamanioBorde);
    }
}
