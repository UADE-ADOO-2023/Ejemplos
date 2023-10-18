package ar.edu.uade.adoo.ejemplos.patrones.command;

public class Main {
    public static void main(String[] args) {
        SistemaArchivos sistemaArchivos = SistemaArchivosFactory.determinarSistemaArchivos();
        //Comando concreto
        Command abrirArchivo = new AbrirArchivo(sistemaArchivos); // asocio receptor (cómo)
        Invoker invocadorArchivos = new Invoker(abrirArchivo); // Con quien interactuo
        invocadorArchivos.ejecutar();
        //Comando concreto
        Command escribirArchivo = new EscribirArchivo(sistemaArchivos, "C://users/ana/Documents", "C://users/ana/Downloads"); // asocio receptor (cómo) y la informacion del comando
        invocadorArchivos.setCommand(escribirArchivo); // Decir al invocador a qué comando tiene que llamar
        invocadorArchivos.ejecutar();
        //Comando concreto
        Command cerrarArchivo = new CerrarArchivo(sistemaArchivos); // asocio receptor (cómo)
        invocadorArchivos.setCommand(cerrarArchivo);
        invocadorArchivos.ejecutar();
    }
}
