package ar.edu.uade.adoo.ejemplos.clase4.lp;

public class Auto extends Vehiculo {
    private int patente;

    public Auto(int patente) {
        this.patente = patente;
    }

    public int obtenerPatente() {
        return this.patente;
    }

    @Override
    public void realizarVTV() {
        System.out.println("Verificando estado");
    }
}
