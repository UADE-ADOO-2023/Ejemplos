package ar.edu.uade.adoo.ejemplos.clase6;

public class SistemaFiltrado {
    private FiltroMensaje cadena;

    public void agregarFiltro(FiltroMensaje filtro) {
        if (this.cadena == null) {
            this.cadena = filtro;
        } else {
            FiltroMensaje eslabonActual = this.cadena;
            while (eslabonActual.getSiguienteEslabon() != null) {
                eslabonActual = eslabonActual.getSiguienteEslabon();
            }
            eslabonActual.setSiguienteEslabon(filtro);
        }
    }

    public Mensaje filtrarMensaje(Mensaje mensaje) {
        return this.cadena.filtrarMensaje(mensaje);
    }


}
