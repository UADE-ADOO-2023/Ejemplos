package ar.edu.uade.adoo.ejemplos.clase4.lp;

public class Auto extends Vehiculo {
    private int patente;

    public Auto(int patente) {
        this.patente = patente;
    }

    @Override
    public int getMatricula() {
        return this.patente;
    }

    public void realizarVTV() {
        System.out.println("Verificando estado");
    }
}
