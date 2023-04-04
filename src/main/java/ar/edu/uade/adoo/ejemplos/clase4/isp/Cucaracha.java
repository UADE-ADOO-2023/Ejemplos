package ar.edu.uade.adoo.ejemplos.clase4.isp;

public class Cucaracha extends Animal {

    public Cucaracha(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando a la cucaracha " + this.nombre);
    }
}
