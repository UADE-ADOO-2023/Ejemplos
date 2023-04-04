package ar.edu.uade.adoo.ejemplos.clase4.ocp;

public class Gerente extends Empleado {
    public Gerente(String nombre, String apellido, double bonoBase) {
        super(nombre, apellido, bonoBase);
    }

    @Override
    public double calcularBono() {
        return 1.2 * this.getBonoBase();
    }
}
