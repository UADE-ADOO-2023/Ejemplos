package ar.edu.uade.adoo.ejemplos.patrones.mediator;

public class Main {
    public static void main(String[] args) {
        Boton boton = new Boton();
        SuministroElectrico suministroElectrico = new SuministroElectrico();
        Ventilador ventilador = new Ventilador();
        PrenderVentiladorMediador mediador = new PrenderVentiladorMediador(boton, suministroElectrico, ventilador);
        boton.setMediador(mediador);
        suministroElectrico.setMediador(mediador);
        ventilador.setMediador(mediador);
        System.out.println("Ventilador " + (ventilador.getEncendido() ? "encendido" : "apagado"));
        boton.presionar();
        System.out.println("Ventilador " + (ventilador.getEncendido() ? "encendido" : "apagado"));
        boton.presionar();
        System.out.println("Ventilador " + (ventilador.getEncendido() ? "encendido" : "apagado"));
    }
}
