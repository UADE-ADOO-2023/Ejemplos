package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class Fabrica {
    private Constructor constructorAuto;

    public Fabrica(Constructor constructorAuto) {
        this.constructorAuto = constructorAuto;
    }

    public void setConstructorAuto(Constructor constructorAuto) {
        this.constructorAuto = constructorAuto;
    }

    public AutoElectrico construirTesla() {
        this.constructorAuto.setAsientos();
        this.constructorAuto.setMotor();
        return ((ConstructorTesla)this.constructorAuto).obtenerAutoElectrico();
    }

    public AutoDiesel construirFord() {
        this.constructorAuto.setAsientos();
        this.constructorAuto.setMotor();
        return ((ConstructorFord)this.constructorAuto).obtenerAutoDiesel();
    }

    public Arenero construirArenero() {
        this.constructorAuto.setMotor();
        return ((ConstructorArenero)this.constructorAuto).obtenerArenero();
    }
}
