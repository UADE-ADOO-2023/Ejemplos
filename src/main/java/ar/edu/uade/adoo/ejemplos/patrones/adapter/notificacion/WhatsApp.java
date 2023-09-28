package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

//Adaptador
public class WhatsApp implements INotificacion{
    private String telefono;
    private WhatsAppLib api;

    public WhatsApp(String telefono) {
        this.telefono = telefono;
        this.api = new WhatsAppLib();
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.api.enviarMensaje(telefono, mensaje);
    }
}
