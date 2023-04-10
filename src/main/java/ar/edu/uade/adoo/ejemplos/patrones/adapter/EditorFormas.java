package ar.edu.uade.adoo.ejemplos.patrones.adapter;

import java.util.ArrayList;
import java.util.List;

public class EditorFormas {
    public static void main(String[] args) {
        List<IForma> formas = new ArrayList<>();
        IForma linea = new Linea();
        IForma texto = new Texto("Hola curso ADOO!");
        formas.add(linea);
        formas.add(texto);
        for (IForma forma: formas) {
            System.out.println(forma.obtenerAreaContenedora());
            IHandle handle = forma.obtenerHandle();
            handle.mover(forma, 100, 200);
        }
    }
}
