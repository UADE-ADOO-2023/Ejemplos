package ar.edu.uade.adoo.ejemplos.clase4.lp;

public class Avion extends Vehiculo {
    private int matricula;
    private double altitud;

    public Avion(int matricula) {
        this.matricula = matricula;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    @Override
    public int getMatricula() {
        return this.matricula;
    }

    public double obtenerAltitud() {
        return altitud;
    }
}
