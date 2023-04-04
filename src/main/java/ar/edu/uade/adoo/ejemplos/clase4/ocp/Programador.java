package ar.edu.uade.adoo.ejemplos.clase4.ocp;

public class Programador extends Empleado{
    public Programador(String nombre, String apellido, double bonoBase) {
        super(nombre, apellido, bonoBase);
    }

    @Override
    public double calcularBono() {
        return 0.6 * this.getBonoBase();
    }
}
