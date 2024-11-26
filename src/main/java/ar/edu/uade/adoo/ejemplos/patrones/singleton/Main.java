package ar.edu.uade.adoo.ejemplos.patrones.singleton;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<SistemaArchivos> instancia1 = SistemaArchivos.getInstancia();
        System.out.println("Hash code instancia 1: " + instancia1.get().hashCode());
        Optional<SistemaArchivos> instancia2 = SistemaArchivos.getInstancia();
        System.out.println("Hash code instancia 2: " + instancia2.get().hashCode());
        Optional<SistemaArchivos> instancia3 = SistemaArchivos.getInstancia();
        System.out.println("Hash code instancia 3: " + instancia3.get().hashCode());
        Optional<SistemaArchivos> instancia4 = SistemaArchivos.getInstancia();
        System.out.println("Hash code instancia 4: " + instancia4.orElseThrow().hashCode());
    }
}
