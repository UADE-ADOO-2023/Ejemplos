package ar.edu.uade.adoo.ejemplos.clase6;
public class ArchivoTextoReader {
    private static ArchivoTextoReader instancia;
    private ArchivoTextoReader() {}

    public static ArchivoTextoReader getInstancia() {
        if (instancia == null) {
            instancia = new ArchivoTextoReader();
        }
        return instancia;
    }
    public Mensaje leerArchivoTexto(String path) {
        //TODO leer archivo
        Mensaje mensaje = new Mensaje(1, "hola como estas", "Ana");
        return mensaje;
    }
}
