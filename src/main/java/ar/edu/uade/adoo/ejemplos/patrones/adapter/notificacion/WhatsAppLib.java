package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

//Adaptado / Adaptable
public class WhatsAppLib {
    public final void enviarMensaje(String phone, String message) {
        System.out.printf("Mandando a telefono %s el mensaje: %s\n", phone, message);
    }
}
