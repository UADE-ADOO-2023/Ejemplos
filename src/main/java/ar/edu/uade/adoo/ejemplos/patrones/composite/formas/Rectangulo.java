package ar.edu.uade.adoo.ejemplos.patrones.composite.formas;

public class Rectangulo implements IForma {

    @Override
    public void pintar() {
        System.out.println("Pintando rectangulo");
    }

    @Override
    public void agregarFigura(IForma forma) {
        throw new UnsupportedOperationException("Los objetos individuales no pueden contener otros");
    }
}
