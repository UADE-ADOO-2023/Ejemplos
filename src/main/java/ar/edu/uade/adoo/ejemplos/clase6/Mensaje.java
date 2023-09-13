package ar.edu.uade.adoo.ejemplos.clase6;

public class Mensaje {
    private Integer id;
    private String mensaje;
    private String remitente;

    public Mensaje(Integer id, String mensaje, String remitente) {
        this.id = id;
        this.mensaje = mensaje;
        this.remitente = remitente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
