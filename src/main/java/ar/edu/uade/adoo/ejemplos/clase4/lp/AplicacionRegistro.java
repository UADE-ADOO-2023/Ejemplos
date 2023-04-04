package ar.edu.uade.adoo.ejemplos.clase4.lp;

import java.util.ArrayList;
import java.util.List;

public class AplicacionRegistro {
    private List<Vehiculo> vehiculos;

    public AplicacionRegistro() {
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public List<Integer> obtenerIdentificadoresDeVehiculos() {
        List<Integer> identificadores = new ArrayList<>();
        for (Vehiculo vehiculo: this.vehiculos) {
            identificadores.add(vehiculo.getMatricula());
        }
        return identificadores;
    }

    public void realizarVTVVehiculos() {
        for (Vehiculo vehiculo: this.vehiculos) {
            if (vehiculo instanceof Auto) {
                ((Auto) vehiculo).realizarVTV();
            }
        }
    }
}
