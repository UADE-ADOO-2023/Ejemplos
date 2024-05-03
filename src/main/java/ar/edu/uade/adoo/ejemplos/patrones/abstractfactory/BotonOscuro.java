package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class BotonOscuro implements Boton{
    @Override
    public void dibujar() {
        System.out.println("Dibujando boton modo oscuro");
    }

    @Override
    public void presionar() {
        System.out.println("Presionando boton modo oscuro");
    }
}
