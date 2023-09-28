package ar.edu.uade.adoo.ejemplos.patrones.composite.formas;

public class AplicacionGrafica {
    public static void main(String[] args) {
        IForma flor = new GrupoFormas();
        flor.agregarFigura(new Circulo());
        flor.agregarFigura(new Circulo());
        flor.agregarFigura(new Circulo());
        flor.agregarFigura(new Circulo());
        flor.agregarFigura(new Circulo());
        flor.agregarFigura(new Circulo());

        IForma cuadro = new GrupoFormas();

        IForma rectangulo = new Rectangulo();
        cuadro.agregarFigura(rectangulo);

        cuadro.agregarFigura(flor);

        cuadro.pintar();


    }
}
