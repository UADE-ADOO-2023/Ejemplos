package ar.edu.uade.adoo.ejemplos.patrones.flyweight;

import java.util.Objects;

public class EspecieArbol {
    private String especie;

    public EspecieArbol(String especie) {
        this.especie = especie;
    }

    public void dibujarEnPantalla(int posicionX, int posicionY) {
        System.out.println("Dibujando especieArbol{" +
                "especie='" + especie + '\'' +
                " en posicion (x'" + posicionX + '\'' +
                "y)'" + posicionY + '\'' +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EspecieArbol that = (EspecieArbol) o;
        return Objects.equals(especie, that.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie);
    }
}
