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

    public int obtenerMatricula() {
        return this.matricula;
    }

    public double obtenerAltitud() {
        return altitud;
    }

    @Override
    public void realizarVTV() {
        throw new UnsupportedOperationException("Los aviones no realizan VTV");
    }
}
