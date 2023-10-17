package ar.edu.uade.adoo.ejemplos.patrones.command;

public class CerrarArchivo implements Command {
    private SistemaArchivos sistemaArchivos;

    public CerrarArchivo(SistemaArchivos sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    @Override
    public void ejecutar() {
        this.sistemaArchivos.cerrarArchivo();
    }
}
