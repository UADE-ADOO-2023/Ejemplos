package ar.edu.uade.adoo.ejemplos.clase4.srp;

public class AplicacionGeometrica {
    public static int calcularAreaDeRectangulo(int lado, int altura) {
        Rectangulo rectangulo = new Rectangulo(lado, altura);
        return rectangulo.calcularArea();
    }
}
