package ar.edu.uade.adoo.ejemplos.clase6;

public class ModuloFiltrado {
    public String filtrarMensaje(String path) {
        Mensaje mensaje = ArchivoTextoReader.getInstancia().leerArchivoTexto(path);
        SistemaFiltrado filtrado = new SistemaFiltrado();
        filtrado.agregarFiltro(new FiltroPrivacidad());
        filtrado.agregarFiltro(new FiltroSpam());
        filtrado.agregarFiltro(new FiltroContenidoIndebido());
        return filtrado.filtrarMensaje(mensaje).getMensaje();
    }
}
