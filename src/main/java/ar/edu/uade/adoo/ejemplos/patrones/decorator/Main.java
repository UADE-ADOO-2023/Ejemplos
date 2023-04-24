package ar.edu.uade.adoo.ejemplos.patrones.decorator;

public class Main {
    public static void main(String[] args) {
        ComponenteVisual texto = new TextView("Hola!");
        texto.dibujar();

        ComponenteVisual borde = new BordeDecorator(texto);
        borde.dibujar();
    }
}
