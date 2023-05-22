package ar.edu.uade.adoo.ejemplos.patrones.observer;

public class Main {
    public static void main(String[] args) {
        Cotizacion cotizacionDolar = new Cotizacion();
        Arbolito arbolito = new Arbolito();
        BotTelegram bot = new BotTelegram();
        cotizacionDolar.agregar(arbolito);
        cotizacionDolar.setCotizacion(465D);
        cotizacionDolar.agregar(bot);
        cotizacionDolar.setCotizacion(490D);
        cotizacionDolar.setCotizacion(480D);
        arbolito.cotizar(480000D);
        cotizacionDolar.setCotizacion(590D);
        cotizacionDolar.eliminar(bot);
        cotizacionDolar.setCotizacion(680D);
        cotizacionDolar.agregar(bot);
        cotizacionDolar.setCotizacion(6180D);
    }
}
