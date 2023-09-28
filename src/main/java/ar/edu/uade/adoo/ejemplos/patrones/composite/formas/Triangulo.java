package ar.edu.uade.adoo.ejemplos.patrones.composite.formas;

public class Triangulo implements  IForma{
    @Override
    public void pintar() {
        System.out.println("Pintando triangulo");
    }

    @Override
    public void agregarFigura(IForma forma) {

    }
}
