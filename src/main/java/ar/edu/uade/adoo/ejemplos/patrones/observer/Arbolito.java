package ar.edu.uade.adoo.ejemplos.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class Arbolito implements Observer{
    private List<Double> cotizaciones;
    public Arbolito() {
        this.cotizaciones = new ArrayList<>();
    }

    @Override
    public void actualizar(Sujeto observable) {
        this.cotizaciones.add(((Cotizacion)observable).getCotizacion());
    }

    public void cotizar(Double pesos) {
        Double dolares = pesos / this.cotizaciones.get(this.cotizaciones.size() - 1);
        System.out.printf("Cotización para %.2f pesos: %.2f dólares :(\n", pesos, dolares);
    }
}
