package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class ModoClaroFactory implements Factory {
    @Override
    public Boton crearBoton() {
        return new BotonClaro();
    }

    @Override
    public Panel crearPanel() {
        return new PanelClaro();
    }
}
