package ar.edu.uade.adoo.ejemplos.patrones.command;

public interface SistemaArchivos {
    void abrirArchivo();
    void escribirArchivo(String pathOrigen, String pathDestino);
    void cerrarArchivo();
}
