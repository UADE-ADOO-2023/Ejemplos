package ar.edu.uade.adoo.ejemplos.clase1;

public class Moto extends Vehiculo{
    private int angulo;

    public Moto(String patente) {
        super(patente);
    }

    public void wheelie(int velocidad) {
        acelerar(velocidad);
        setAngulo(45);
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    @Override
    public void encender() {
        System.out.println("Enciendo moto");
    }
}
