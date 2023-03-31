package ar.edu.uade.adoo.ejemplos.clase4.ocp;

public class AplicacionLiquidacion {
    public static double obtenerLiquidacionParaTipoEmpleado(Empresa empresa, TipoEmpleado tipoEmpleado) {
        switch (tipoEmpleado) {
            case GERENTE:
                return empresa.obtenerLiquidacionGerentes();
            case PROGRAMADOR:
                return empresa.obtenerLiquidacionProgramadores();
        }
        return 0;
    }
}
