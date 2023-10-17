package ar.edu.uade.adoo.ejemplos.patrones.command;

public class SistemaArchivosUnix implements SistemaArchivos{
    @Override
    public void abrirArchivo() {
        System.out.println("Abriendo archivo en Unix");
    }

    @Override
    public void escribirArchivo() {
        System.out.println("Escribiendo archivo en Unix");
    }

    @Override
    public void cerrarArchivo() {
        System.out.println("Cerrando archivo en Unix");
    }
}
