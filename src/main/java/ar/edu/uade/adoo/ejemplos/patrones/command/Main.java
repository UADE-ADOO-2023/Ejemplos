package ar.edu.uade.adoo.ejemplos.patrones.command;

public class Main {
    public static void main(String[] args) {
        SistemaArchivos sistemaArchivos = SistemaArchivosFactory.determinarSistemaArchivos();
        Command abrirArchivo = new AbrirArchivo(sistemaArchivos);
        Invoker invocadorArchivos = new Invoker(abrirArchivo);
        invocadorArchivos.ejecutar();
        Command escribirArchivo = new EscribirArchivo(sistemaArchivos);
        invocadorArchivos.setCommand(escribirArchivo);
        invocadorArchivos.ejecutar();
        Command cerrarArchivo = new CerrarArchivo(sistemaArchivos);
        invocadorArchivos.setCommand(cerrarArchivo);
        invocadorArchivos.ejecutar();
    }
}
