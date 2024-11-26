package ar.edu.uade.adoo.ejemplos.patrones.facade;

public class Main {
    public static void main(String[] args) {
        GUIFacade facade = new GUIFacade();
        facade.dibujarGUIOscura();
        System.out.println("-- Cambio a modo claro --");
        facade.dibujarGUIClara();
    }
}
