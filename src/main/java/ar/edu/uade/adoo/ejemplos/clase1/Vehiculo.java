package ar.edu.uade.adoo.ejemplos.clase1;

public abstract class Vehiculo {
    private int velocidadActual;
    private int velocidadMaxima;
    private String patente;

    public Vehiculo(String patente) {
        this.patente = patente;
        encender();
    }

    public abstract void encender();

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad < velocidadMaxima) {
            velocidadActual += velocidad;
        }
    }
}
