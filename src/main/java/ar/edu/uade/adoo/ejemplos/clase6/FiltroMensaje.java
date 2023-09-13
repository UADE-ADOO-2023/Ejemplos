package ar.edu.uade.adoo.ejemplos.clase6;

public interface FiltroMensaje {
    Mensaje filtrarMensaje(Mensaje mensaje);
    void setSiguienteEslabon(FiltroMensaje mensaje);
    FiltroMensaje getSiguienteEslabon();
}
