package ar.edu.uade.adoo.ejemplos.patrones.adapter.notificacion;

//Cliente
public class Main {
    public static void main(String[] args) {
        INotificacion notificador = new WhatsApp("+541112345678");
        notificador.enviarMensaje("Hola desde ADOO!");
    }
}
