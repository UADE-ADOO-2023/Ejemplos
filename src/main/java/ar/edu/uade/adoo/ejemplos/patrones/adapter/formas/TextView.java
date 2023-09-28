package ar.edu.uade.adoo.ejemplos.patrones.adapter.formas;

// Asumimos que esta clase pertenece a una libreria, es la adaptada
public class TextView {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public int obtenerExtension() {
        return this.text.length();
    }
}
