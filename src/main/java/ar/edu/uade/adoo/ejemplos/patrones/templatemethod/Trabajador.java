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

    private void levantarse() {
        System.out.println("Me levanto");
    }

    private void cambiarse() {
        System.out.println("Me cambio");
    }

    private void prepararDesayuno() {
        System.out.println("Preparo desayuno");
    }

    public final void baniarse() {
        System.out.println("Me baño");
    }

    public final void dormir() {
        System.out.println("Me voy a dormir");
    }

    public abstract void trabajar();
}
