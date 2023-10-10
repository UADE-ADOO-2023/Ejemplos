package ar.edu.uade.adoo.ejemplos.patrones.templatemethod;

public abstract class Trabajador {

    public void realizarRutina() {
        levantarse();
        cambiarse();
        prepararDesayuno();
        trabajar();
        baniarse();
        dormir();
    }

    public void levantarse() {
        System.out.println("Me levanto");
    }

    public void cambiarse() {
        System.out.println("Me cambio");
    }

    public void prepararDesayuno() {
        System.out.println("Preparo desayuno");
    }

    public final void baniarse() {
        System.out.println("Me baño");
    }

    public void dormir() {
        System.out.println("Me voy a dormir");
    }

    public abstract void trabajar();
}
