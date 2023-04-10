package ar.edu.uade.adoo.ejemplos.patrones.adapter;

// Clase adaptadora
public class Texto implements IForma {
    private TextView textView;

    public Texto(String text) {
        this.textView = new TextView();
        this.textView.setText(text);
    }

    @Override
    public String getNombre() {
        return "Texto";
    }

    @Override
    public int obtenerAreaContenedora() {
        return textView.obtenerExtension();
    }

    @Override
    public IHandle obtenerHandle() {
        return new TextoHandle();
    }
}
