package ar.edu.uade.adoo.ejemplos.clase4.isp;

public class Perro extends Animal implements IMascota{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al perrito " + this.nombre);
    }

    @Override
    public void acariciar() {
        System.out.println("Acariciando al perrito " + this.nombre);
    }
}
