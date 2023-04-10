package ar.edu.uade.adoo.ejemplos.patrones.strategy;

public class Rectangulo implements IForma {
    private Integer base;
    private Integer altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (double) this.base * this.altura;
    }
}
