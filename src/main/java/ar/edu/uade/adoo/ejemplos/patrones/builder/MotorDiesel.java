package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class MotorDiesel extends Motor{
    public MotorDiesel(int caballosFuerza) {
        super(caballosFuerza);
    }

    @Override
    public void encender() {
        System.out.println("Enciendo motor diesel, HP: " + this.getCaballosFuerza());
    }


}
