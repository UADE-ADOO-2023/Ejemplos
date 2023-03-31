package ar.edu.uade.adoo.ejemplos.clase4.ocp;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private static final int BONO_BASE = 10000;
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, String apellido, TipoEmpleado tipoEmpleado) {
        this.empleados.add(new Empleado(nombre, apellido, BONO_BASE, tipoEmpleado));
    }

    public double obtenerLiquidacionGerentes() {
        double bonos = 0;
        for (Empleado empleado: this.empleados) {
            if (empleado.getTipoEmpleado().equals(TipoEmpleado.GERENTE)) {
                bonos += empleado.calcularBono();
            }
        }
        return bonos;
    }

    public double obtenerLiquidacionProgramadores() {
        double bonos = 0;
        for (Empleado empleado: this.empleados) {
            if (empleado.getTipoEmpleado().equals(TipoEmpleado.PROGRAMADOR)) {
                bonos += empleado.calcularBono();
            }
        }
        return bonos;
    }
}
