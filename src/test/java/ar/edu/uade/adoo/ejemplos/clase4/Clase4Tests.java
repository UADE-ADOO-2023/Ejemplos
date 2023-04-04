package ar.edu.uade.adoo.ejemplos.clase4;

import ar.edu.uade.adoo.ejemplos.clase4.dip.*;
import ar.edu.uade.adoo.ejemplos.clase4.isp.*;
import ar.edu.uade.adoo.ejemplos.clase4.lp.AplicacionRegistro;
import ar.edu.uade.adoo.ejemplos.clase4.lp.Auto;
import ar.edu.uade.adoo.ejemplos.clase4.lp.Avion;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.AplicacionLiquidacion;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.Empresa;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.Gerente;
import ar.edu.uade.adoo.ejemplos.clase4.ocp.Programador;
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
        int bonoBase = 10000;
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new Programador("Ana", "Martinez", bonoBase));
        empresa.agregarEmpleado(new Programador("Paula", "Perez", bonoBase));
        empresa.agregarEmpleado(new Programador("Romina", "Ramirez", bonoBase));
        empresa.agregarEmpleado(new Gerente("The boss", "Martinez", bonoBase));
        assertEquals(18000, AplicacionLiquidacion.obtenerLiquidacionProgramadores(empresa), 0D);
        assertEquals(12000, AplicacionLiquidacion.obtenerLiquidacionGerentes(empresa), 0D);
    }

    @Test
    public void lpTest() {
        AplicacionRegistro registro = new AplicacionRegistro();
        registro.registrarVehiculo(new Avion(123));
        registro.registrarVehiculo(new Auto(982899));
        registro.registrarVehiculo(new Avion(45));
        assertEquals(3, registro.obtenerIdentificadoresDeVehiculos().size());
        //registro.realizarVTVVehiculos();
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
        ((IMascota)blackie).acariciar();
        ((IMascota)firulais).acariciar();
    }

    @Test
    public void dipTest() {
        Articulo notebook = new Articulo("Lenovo ThinkPad", 200000);
        Articulo mouse = new Articulo("Logitech M21", 20000);
        Articulo sdd = new Articulo("SDD Western Digital Black", 70000);
        List<Articulo> articulos = Arrays.asList(notebook, mouse, sdd);
        Compra compra = new Compra(new SQLDB(), new TarjetaDebito());
        compra.guardarArticulos(articulos);
        compra.comprarArticulos(articulos);
    }
}
