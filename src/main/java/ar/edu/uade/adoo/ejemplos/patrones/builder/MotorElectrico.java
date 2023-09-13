package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class MotorElectrico extends Motor{
    public MotorElectrico(int caballosFuerza) {
        super(caballosFuerza);
    }

    @Override
    public void encender() {
        System.out.println("Enciendo motor electrico, HP: " + this.getCaballosFuerza());
    }
}
