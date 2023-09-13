package ar.edu.uade.adoo.ejemplos.clase6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FiltroContenidoIndebido implements FiltroMensaje{
    private FiltroMensaje siguiente;
    private List<String> palabrasACensurar = Arrays.asList("crypto", "gun");

    public void definirPalabrasIndebidas(List<String> palabras) {
        this.palabrasACensurar = palabras;
    }

    @Override
    public Mensaje filtrarMensaje(Mensaje mensaje) {
        if(palabrasACensurar.contains(mensaje.getMensaje())) {
            mensaje.setMensaje("Censurado!");
        }
        if (this.siguiente != null) {
            return this.siguiente.filtrarMensaje(mensaje);
        }
        return mensaje;
    }

    @Override
    public void setSiguienteEslabon(FiltroMensaje mensaje) {
        this.siguiente = mensaje;
    }

    @Override
    public FiltroMensaje getSiguienteEslabon() {
        return siguiente;
    }
}
