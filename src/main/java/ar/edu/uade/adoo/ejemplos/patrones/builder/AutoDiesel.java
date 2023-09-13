package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class AutoDiesel {
    private int asientos;
    private Motor motor;

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "AutoDiesel{" +
                "asientos=" + asientos +
                ", motor=" + motor +
                '}';
    }
}
