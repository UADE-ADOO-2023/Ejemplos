package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class Arenero {
    private Motor motor;

    public Arenero() {

    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Arenero{" +
                "motor=" + motor +
                '}';
    }
}
