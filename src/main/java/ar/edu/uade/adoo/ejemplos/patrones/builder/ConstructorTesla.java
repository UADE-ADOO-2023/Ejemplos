package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class ConstructorTesla implements Constructor{
    private AutoElectrico auto;

    public ConstructorTesla() {
        this.auto = new AutoElectrico();
    }

    @Override
    public void setAsientos() {
        this.auto.setAsientos(4);
    }

    @Override
    public void setMotor() {
        this.auto.setMotor(new MotorElectrico(691));
    }

    public AutoElectrico obtenerAutoElectrico() {
        return this.auto;
    }
}
