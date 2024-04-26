package ar.edu.uade.adoo.ejemplos.clase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 */
public class GestorArchivos {

    /**
     * Default constructor
     */
    private GestorArchivos() {
    }

    /**
     *
     */
    private static GestorArchivos instancia;

    /**
     * @return
     */
    public static GestorArchivos getInstancia() {
        if (instancia == null) {
            instancia = new GestorArchivos();
        }
        return instancia;
    }

    /**
     * @param path
     * @return
     */
    public List<Mensaje> leerArchivo(String path) {
        List<Mensaje> mensajes = new ArrayList<>();
        try {
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                mensajes.add(new Mensaje(mensajes.size(), linea));
        } catch (IOException e) {

        }
        return mensajes;
    }

}
