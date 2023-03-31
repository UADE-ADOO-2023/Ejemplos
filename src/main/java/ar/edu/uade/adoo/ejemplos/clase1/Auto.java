package ar.edu.uade.adoo.ejemplos.clase1;

public class Auto extends Vehiculo {
    private boolean radioEncendida;

    public Auto(String patente) {
        super(patente);
    }

    public void apagarRadio() {
        if (radioEncendida) {
            radioEncendida = false;
        }
    }

    @Override
    public void encender() {
        System.out.println("Enciendo auto");
    }

    public void encender(boolean radioEncendida) {
        encender();
        this.radioEncendida = radioEncendida;
        System.out.println("Enciendo radio");
    }

    public void encender(int volumen) {

    }
}
