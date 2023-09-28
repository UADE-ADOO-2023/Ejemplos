package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

public class SMS implements INotificacion{
    private String telefono;
    private TwilioAPI api;

    public SMS(String telefono) {
        this.telefono = telefono;
        this.api = new TwilioAPI();
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.api.sendSMS(telefono, mensaje);
    }
}
