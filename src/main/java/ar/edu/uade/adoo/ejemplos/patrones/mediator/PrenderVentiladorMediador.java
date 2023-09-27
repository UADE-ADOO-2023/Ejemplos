package ar.edu.uade.adoo.ejemplos.patrones.mediator;

public class PrenderVentiladorMediador implements Mediador{
    private Boton boton;
    private SuministroElectrico suministroElectrico;
    private Ventilador ventilador;

    public PrenderVentiladorMediador(Boton boton, SuministroElectrico suministroElectrico, Ventilador ventilador) {
        this.boton = boton;
        this.suministroElectrico = suministroElectrico;
        this.ventilador = ventilador;
    }

    @Override
    public void encender() {
        suministroElectrico.encender();
    }

    @Override
    public void apagar() {
        suministroElectrico.apagar();
    }

    @Override
    public void presionar() {
        if (ventilador.getEncendido()) {
            ventilador.apagarVentilador();
        } else {
            ventilador.encenderVentilador();
        }
    }
}
