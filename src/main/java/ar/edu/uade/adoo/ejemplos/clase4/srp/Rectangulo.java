package ar.edu.uade.adoo.ejemplos.clase4.srp;

public class Rectangulo {
    private int lado;
    private int altura;

    public Rectangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public int calcularArea() {
        return this.lado * this.altura;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
