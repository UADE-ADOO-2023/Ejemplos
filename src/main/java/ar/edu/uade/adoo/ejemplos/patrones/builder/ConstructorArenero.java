package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class ConstructorArenero implements Constructor{
    private Arenero auto;

    public ConstructorArenero() {
        this.auto = new Arenero();
    }

    @Override
    public void setAsientos() {

    }

    @Override
    public void setMotor() {
        this.auto.setMotor(new MotorDiesel(168));
    }

    public Arenero obtenerArenero() {
        return this.auto;
    }
}
