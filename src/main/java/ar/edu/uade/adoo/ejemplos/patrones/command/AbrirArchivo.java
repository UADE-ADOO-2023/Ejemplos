package ar.edu.uade.adoo.ejemplos.patrones.command;

public class AbrirArchivo implements Command{
    private SistemaArchivos sistemaArchivos;

    public AbrirArchivo(SistemaArchivos sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    @Override
    public void ejecutar() {
        this.sistemaArchivos.abrirArchivo();
    }
}
