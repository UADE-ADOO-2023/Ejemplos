package ar.edu.uade.adoo.ejemplos.patrones.command;

public class EscribirArchivo implements Command {
    private SistemaArchivos sistemaArchivos;
    private String pathDestino;
    private String pathArchivo;


    public EscribirArchivo(SistemaArchivos sistemaArchivos, String pathDestino, String pathArchivo) {
        this.sistemaArchivos = sistemaArchivos;
        this.pathDestino = pathDestino;
        this.pathArchivo = pathArchivo;
    }

    @Override
    public void ejecutar() {
        this.sistemaArchivos.escribirArchivo(this.pathArchivo, this.pathDestino);
    }
}
