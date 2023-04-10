package ar.edu.uade.adoo.ejemplos.patrones.strategy;

public class Circulo implements IForma {
    private Integer radio;

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
