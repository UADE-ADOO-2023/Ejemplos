package ar.edu.uade.adoo.ejemplos.patrones.command;

public class SistemaArchivosWindows implements SistemaArchivos{
    @Override
    public void abrirArchivo() {
        System.out.println("Abriendo archivo en Windows");
    }

    @Override
    public void escribirArchivo(String pathOrigen, String pathDestino) {
        System.out.println("Escribiendo archivo " + pathOrigen + " en destino " + pathDestino + " en Windows");
    }

    @Override
    public void cerrarArchivo() {
        System.out.println("Cerrando archivo en Windows");
    }
}
