package ar.edu.uade.adoo.ejemplos.patrones.facade;

import ar.edu.uade.adoo.ejemplos.patrones.abstractfactory.Boton;
import ar.edu.uade.adoo.ejemplos.patrones.abstractfactory.Factory;
import ar.edu.uade.adoo.ejemplos.patrones.abstractfactory.ModoClaroFactory;
import ar.edu.uade.adoo.ejemplos.patrones.abstractfactory.ModoOscuroFactory;

public class GUIFacade {
    public void dibujarGUIOscura() {
        this.dibujarPantalla(new ModoOscuroFactory());
    }

    public void dibujarGUIClara() {
        this.dibujarPantalla(new ModoClaroFactory());
    }

    private void dibujarPantalla(Factory factory) {
        Boton boton = factory.crearBoton();
        boton.dibujar();
        factory.crearPanel().dibujar();
        boton.presionar();
    }
}
