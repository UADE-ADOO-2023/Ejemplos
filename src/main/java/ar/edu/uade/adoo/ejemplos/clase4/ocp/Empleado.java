package ar.edu.uade.adoo.ejemplos.clase4.ocp;

public class Empleado {
    private String nombre;
    private String apellido;
    private double bonoBase;
    private TipoEmpleado tipoEmpleado;

    public Empleado(String nombre, String apellido, double bonoBase, TipoEmpleado tipoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.bonoBase = bonoBase;
        this.tipoEmpleado = tipoEmpleado;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public double calcularBono() {
        switch (this.tipoEmpleado) {
            case GERENTE:
                return bonoBase * 1.2;
            case PROGRAMADOR:
                return bonoBase * 0.6;
            default:
                return bonoBase;
        }
    }
}
