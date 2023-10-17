package ar.edu.uade.adoo.ejemplos.patrones.command;

public class SistemaArchivosFactory {
    public static SistemaArchivos determinarSistemaArchivos(){
        String sistemaOperativo = System.getProperty("os.name");
        if (sistemaOperativo.toLowerCase().contains("windows")) {
            return new SistemaArchivosWindows();
        } else {
            return new SistemaArchivosUnix();
        }
    }
}
