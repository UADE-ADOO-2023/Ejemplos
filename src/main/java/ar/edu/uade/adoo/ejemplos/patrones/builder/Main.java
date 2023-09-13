package ar.edu.uade.adoo.ejemplos.patrones.builder;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica(new ConstructorTesla());
        System.out.println(fabrica.construirTesla());
        fabrica.setConstructorAuto(new ConstructorFord());
        System.out.println(fabrica.construirFord());
        fabrica.setConstructorAuto(new ConstructorArenero());
        System.out.println(fabrica.construirArenero());
    }
}
