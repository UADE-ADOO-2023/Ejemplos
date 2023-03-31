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

    public void dibujar() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.lado; j++) {
                GUI.mostrar("□");
            }
            GUI.mostrar("\n");
        }

    }
}
