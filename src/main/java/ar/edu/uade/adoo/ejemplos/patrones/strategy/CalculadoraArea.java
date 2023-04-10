package ar.edu.uade.adoo.ejemplos.patrones.strategy;

public class CalculadoraArea {
    private IForma forma;

    public CalculadoraArea(IForma forma) {
        this.forma = forma;
    }

    public void setForma(IForma forma) {
        this.forma = forma;
    }

    public Double calcularArea() {
        return this.forma.calcularArea();
    }
}
