package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

public class GmailAPI {
    public final void send(String email, String body) {
        System.out.printf("Mandando a mail %s el mensaje: %s\n", email, body);
    }
}
