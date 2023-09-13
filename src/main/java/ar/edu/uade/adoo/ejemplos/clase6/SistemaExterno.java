package ar.edu.uade.adoo.ejemplos.clase6;

public class SistemaExterno {
    public static void main(String [] args) {
        ModuloFiltrado sistema = new ModuloFiltrado();
        System.out.println(sistema.filtrarMensaje("./data/ejemplo.txt"));
    }
}
