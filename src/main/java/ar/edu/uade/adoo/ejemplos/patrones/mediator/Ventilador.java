package ar.edu.uade.adoo.ejemplos.patrones.mediator;

public class Ventilador extends Colega{
    private Boolean encendido;

    public Ventilador() {
        this.encendido = false;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void encenderVentilador() {
        this.mediador.encender();
        this.encendido = true;
    }

    public void apagarVentilador() {
        this.encendido = false;
        this.mediador.apagar();
    }
}
