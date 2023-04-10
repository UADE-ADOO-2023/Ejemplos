package ar.edu.uade.adoo.ejemplos.patrones.strategy;

public class Triangulo implements IForma{
    private Integer base;
    private Integer altura;

    public Triangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (double) (base * altura / 2);
    }
}
