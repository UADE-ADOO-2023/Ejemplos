package ar.edu.uade.adoo.ejemplos.clase4;

import ar.edu.uade.adoo.ejemplos.clase4.dip.Articulo;
import ar.edu.uade.adoo.ejemplos.clase4.dip.Tienda;
import ar.edu.uade.adoo.ejemplos.clase4.isp.Animal;
import ar.edu.uade.adoo.ejemplos.clase4.isp.Cucaracha;
import ar.edu.uade.adoo.ejemplos.clase4.isp.Perro;
import ar.edu.uade.adoo.ejemplos.clase4.isp.Veterinaria;
import ar.edu.uade.adoo.ejemplos.clase4.lp.AplicacionRegistro;
import ar.edu.uade.adoo.ejemplos.clase4.lp.Auto;
import ar.edu.uade.adoo.ejemplos.clase4.lp.Avion;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.AplicacionLiquidacion;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.Empresa;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.TipoEmpleado;
import ar.edu.uade.adoo.ejemplos.clase4.srp.AplicacionGeometrica;
import ar.edu.uade.adoo.ejemplos.clase4.srp.AplicacionGrafica;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Clase4Tests {
    @Test
    public void srpTest() {
        AplicacionGrafica.dibujarRectangulo();
        assertEquals(4, AplicacionGeometrica.calcularAreaDeRectangulo(2, 2));
        assertEquals(6, AplicacionGeometrica.calcularAreaDeRectangulo(2, 3));
    }

    @Test
    public void ocpTest() {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado("Ana", "Martinez", TipoEmpleado.PROGRAMADOR);
        empresa.agregarEmpleado("Paula", "Perez", TipoEmpleado.PROGRAMADOR);
        empresa.agregarEmpleado("Romina", "Ramirez", TipoEmpleado.PROGRAMADOR);
        empresa.agregarEmpleado("The boss", "Martinez", TipoEmpleado.GERENTE);
        assertEquals(18000, AplicacionLiquidacion.obtenerLiquidacionParaTipoEmpleado(empresa, TipoEmpleado.PROGRAMADOR), 0D);
        assertEquals(12000, AplicacionLiquidacion.obtenerLiquidacionParaTipoEmpleado(empresa, TipoEmpleado.GERENTE), 0D);
    }

    @Test
    public void lpTest() {
        AplicacionRegistro registro = new AplicacionRegistro();
        registro.registrarVehiculo(new Avion(123));
        registro.registrarVehiculo(new Auto(982899));
        registro.registrarVehiculo(new Avion(45));
        assertEquals(3, registro.obtenerIdentificadoresDeVehiculos().size());
        // registro.realizarVTVVehiculos();
    }

    @Test
    public void ispTest() {
        Animal blackie = new Perro("Blackie");
        Animal cuca = new Cucaracha("Cuca");
        Animal firulais = new Perro("Firulais");
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.agregarAnimal(blackie);
        veterinaria.agregarAnimal(cuca);
        veterinaria.agregarAnimal(firulais);
        veterinaria.alimentarAnimales();
        blackie.acariciar();
        cuca.acariciar();
        firulais.acariciar();
    }

    @Test
    public void dipTest() {
        Articulo notebook = new Articulo("Lenovo ThinkPad", 200000);
        Articulo mouse = new Articulo("Logitech M21", 20000);
        Articulo sdd = new Articulo("SDD Western Digital Black", 70000);
        List<Articulo> articulos = Arrays.asList(notebook, mouse, sdd);
        Tienda.guardarArticulos(articulos);
        Tienda.comprarArticulos(articulos);
    }
}
