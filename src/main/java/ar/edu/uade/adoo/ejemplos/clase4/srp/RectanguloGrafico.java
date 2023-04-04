package ar.edu.uade.adoo.ejemplos.clase4.srp;

public class RectanguloGrafico extends Rectangulo{
    public RectanguloGrafico(int lado, int altura) {
        super(lado, altura);
    }

    public void dibujar() {
        for (int i = 0; i < this.getAltura(); i++) {
            for (int j = 0; j < this.getLado(); j++) {
                GUI.mostrar("□");
            }
            GUI.mostrar("\n");
        }

    }
}
