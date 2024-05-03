package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ModoOscuroFactory();
        Boton botonAceptar = factory.crearBoton();
        Panel panelPrincipal = factory.crearPanel();
        botonAceptar.dibujar();
        panelPrincipal.dibujar();
        botonAceptar.presionar();
        System.out.println("-- Cambio a modo claro --");
        factory = new ModoClaroFactory();
        botonAceptar = factory.crearBoton();
        panelPrincipal = factory.crearPanel();
        botonAceptar.dibujar();
        panelPrincipal.dibujar();
        botonAceptar.presionar();
    }
}
