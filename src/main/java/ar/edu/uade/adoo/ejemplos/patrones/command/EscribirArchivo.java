package ar.edu.uade.adoo.ejemplos.patrones.command;

public class EscribirArchivo implements Command {
    private SistemaArchivos sistemaArchivos;

    public EscribirArchivo(SistemaArchivos sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    @Override
    public void ejecutar() {
        this.sistemaArchivos.escribirArchivo();
    }
}
