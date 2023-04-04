package ar.edu.uade.adoo.ejemplos.clase4.ocp;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double bonoBase;

    public Empleado(String nombre, String apellido, double bonoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.bonoBase = bonoBase;
    }

    public abstract double calcularBono();

    public double getBonoBase() {
        return bonoBase;
    }
}
