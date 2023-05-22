package ar.edu.uade.adoo.ejemplos.patrones.observer;

public class BotTelegram implements Observer {
    private Double cotizacion;

    @Override
    public void actualizar(Sujeto observable) {
        Double cotizacionActual = ((Cotizacion) observable).getCotizacion();
        if (this.cotizacion != null) {
            System.out.printf("Cambio de cotización! Precio anterior: %.2f, nuevo precio %.2f :(\n", cotizacion, cotizacionActual);
        }
        this.cotizacion = cotizacionActual;
    }
}
