package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class ConstructorFord implements Constructor{
    private AutoDiesel auto;

    public ConstructorFord() {
        this.auto = new AutoDiesel();
    }

    @Override
    public void setAsientos() {
        this.auto.setAsientos(5);
    }

    @Override
    public void setMotor() {
        this.auto.setMotor(new MotorDiesel(68));
    }

    public AutoDiesel obtenerAutoDiesel() {
        return this.auto;
    }
}
