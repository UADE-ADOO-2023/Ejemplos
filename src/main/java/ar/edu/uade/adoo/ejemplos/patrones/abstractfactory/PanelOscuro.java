package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class PanelOscuro implements Panel{
    @Override
    public void dibujar() {
        System.out.println("Dibujando panel modo oscuro");
    }
}
