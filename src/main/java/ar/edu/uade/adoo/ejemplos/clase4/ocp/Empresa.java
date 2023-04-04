package ar.edu.uade.adoo.ejemplos.clase4.ocp;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public double obtenerLiquidacionGerentes() {
        return obtenerLiquidacion(Gerente.class);
    }

    public double obtenerLiquidacionProgramadores() {
       return obtenerLiquidacion(Programador.class);
    }

    private double obtenerLiquidacion(Class clazz) {
        double bonos = 0;
        for (Empleado empleado: this.empleados) {
            if (empleado.getClass().equals(clazz)) {
                bonos += empleado.calcularBono();
            }
        }
        return bonos;
    }
}
