package ar.edu.uade.adoo.ejemplos.patrones.proxy;

public class Main {
    public static void main(String[] args) {
        Grafico imagen = new ProxyImagen("its-a-design.jpg");
        imagen.cargar();
        imagen.dibujar();
    }
}
