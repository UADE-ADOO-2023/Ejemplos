package ar.edu.uade.adoo.ejemplos.patrones.adapter2;

public class TwilioAPI {
    public final void sendSMS(String recipient, String message ) {
        System.out.printf("Mandando SMS %s el mensaje: %s\n", recipient, message);
    }
}
