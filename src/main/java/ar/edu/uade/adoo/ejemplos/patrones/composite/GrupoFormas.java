package ar.edu.uade.adoo.ejemplos.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoFormas implements IForma {
    private List<IForma> formas;

    public GrupoFormas() {
        this.formas = new ArrayList<>();
    }

    @Override
    public void agregarFigura(IForma forma) {
        this.formas.add(forma);
    }

    @Override
    public void pintar() {
        this.formas.forEach(IForma::pintar);
        /*
        Equivalente a
        this.formas.forEach(forma -> forma.pintar());
        o
        for (IForma forma: this.formas
             ) {
            forma.pintar();
        }
        o
        for (int i = 0; i < this.formas.size(); i++) {
            this.formas.get(i).pintar();
        }
        */
    }
}
