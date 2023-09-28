package ar.edu.uade.adoo.ejemplos.patrones.adapter.formas;

public class Linea implements IForma {
    @Override
    public String getNombre() {
        return "Linea";
    }

    @Override
    public int obtenerAreaContenedora() {
        // Debería calcularla en base a la dimensión de la forma, por simplicidad devolvemos un valor hardcodeado
        return 30;
    }

    @Override
    public IHandle obtenerHandle() {
        return new DragDropHandle();
    }
}
