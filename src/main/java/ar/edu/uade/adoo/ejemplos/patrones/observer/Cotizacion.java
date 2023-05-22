package ar.edu.uade.adoo.ejemplos.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class Cotizacion implements Sujeto {
    private List<Observer> observers;
    private Double cotizacion;

    public Cotizacion() {
        this.observers = new ArrayList<>();
        this.cotizacion = 469D;
    }

    @Override
    public void agregar(Observer observador) {
        this.observers.add(observador);
        System.out.println("Suscribiendo observador");
    }

    @Override
    public void eliminar(Observer observador) {
        this.observers.remove(observador);
        System.out.println("Desuscribiendo observador");
    }

    @Override
    public void notificar() {
        // this.observers.forEach(observer -> observer.actualizar(this));
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).actualizar(this);
        }
    }

    public Double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        this.cotizacion = cotizacion;
        System.out.println("Cambio de cotización");
        this.notificar();
    }
}
