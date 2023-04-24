package ar.edu.uade.adoo.ejemplos.patrones.decorator;

public class TextView extends ComponenteVisual {
    private String texto;

    public TextView(String texto) {
        this.texto = texto;
    }

    @Override
    public void dibujar() {
        System.out.println(this.texto);
    }
}
