package ar.edu.uade.adoo.ejemplos.patrones.strategy;

public class Main {
    public static void main(String[] args) {
        IForma circulo = new Circulo(10);
        CalculadoraArea calculadoraArea = new CalculadoraArea(circulo);
        System.out.println(calculadoraArea.calcularArea());
        IForma triangulo = new Triangulo(10, 20);
        calculadoraArea.setForma(triangulo);
        System.out.println(calculadoraArea.calcularArea());
    }
}
