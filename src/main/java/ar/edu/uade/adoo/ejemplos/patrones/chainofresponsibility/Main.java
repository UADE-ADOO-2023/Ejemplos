package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class Main {
    public static void main(String [] args) {
        AsignadorTareas asignadorTareas = new AsignadorTareas();
        Peticion peticion = new Peticion(TipoPeticion.CLASE, "Preparar contenido para clase");
        asignadorTareas.asignarTarea(peticion);
        peticion = new Peticion(TipoPeticion.TAREA, "Practicar patrones de diseño");
        asignadorTareas.asignarTarea(peticion);
        peticion = new Peticion(TipoPeticion.CONTABLES, "Liquidar sueldo");
        asignadorTareas.asignarTarea(peticion);
    }
}
