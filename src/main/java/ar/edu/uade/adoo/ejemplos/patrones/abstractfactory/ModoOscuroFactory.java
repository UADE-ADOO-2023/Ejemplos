package ar.edu.uade.adoo.ejemplos.patrones.abstractfactory;

public class ModoOscuroFactory implements Factory {
    @Override
    public Boton crearBoton() {
        return new BotonOscuro();
    }

    @Override
    public Panel crearPanel() {
        return new PanelOscuro();
    }
}
