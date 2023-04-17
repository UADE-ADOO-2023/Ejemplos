package ar.edu.uade.adoo.ejemplos.patrones.composite;

public class Circulo implements IForma {

    @Override
    public void pintar() {
        System.out.println("Pintando circulo");
    }

    @Override
    public void agregarFigura(IForma forma) {
        throw new UnsupportedOperationException("Los objetos individuales no pueden contener otros");
    }
}
