package ar.edu.uade.adoo.ejemplos.clase4.isp;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Animal> animales;

    public Veterinaria() {
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public void alimentarAnimales() {
        for (Animal animal: this.animales) {
            animal.alimentar();
        }
    }
}
