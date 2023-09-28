package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

public class Email implements INotificacion{
    private String mail;
    private GmailAPI api;

    public Email(String mail) {
        this.mail = mail;
        this.api = new GmailAPI();
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.api.send(mail, mensaje);
    }
}
