package ar.edu.uade.adoo.ejemplos.clase4.isp;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void alimentar();
    public abstract void acariciar();
}
