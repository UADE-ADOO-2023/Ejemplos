package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class BotonClaro implements Boton{
    @Override
    public void dibujar() {
        System.out.println("Dibujando boton modo claro");
    }

    @Override
    public void presionar() {
        System.out.println("Presionando boton modo claro");
    }
}
