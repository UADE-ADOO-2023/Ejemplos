
package ar.edu.uade.adoo.ejemplos.clase6;

public class FiltroPrivacidad implements FiltroMensaje{
    private FiltroMensaje siguiente;

    @Override
    public Mensaje filtrarMensaje(Mensaje mensaje) {
        if (this.encontrarDatoSensible(mensaje)) {
            mensaje = censurarInfoSensible(mensaje);
        }
        if (this.siguiente != null) {
            return this.siguiente.filtrarMensaje(mensaje);
        }
        return mensaje;
    }

    public Boolean encontrarDatoSensible(Mensaje mensaje) {
        //TODO
        return true;
    }

    public Mensaje censurarInfoSensible(Mensaje mensaje) {
        mensaje.setMensaje("Censurado!");
        return mensaje;
    }

    @Override
    public void setSiguienteEslabon(FiltroMensaje mensaje) {
        this.siguiente = mensaje;
    }

    @Override
    public FiltroMensaje getSiguienteEslabon() {
        return this.siguiente;
    }
}
