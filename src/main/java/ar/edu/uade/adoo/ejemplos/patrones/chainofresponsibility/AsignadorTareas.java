package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class AsignadorTareas {
    private ManejadorPeticion cadena;

    public AsignadorTareas() {
        ManejadorPeticion estudiante = new Estudiante(null);
        ManejadorPeticion profesor = new Profesor(estudiante);
        ManejadorPeticion director = new Director(profesor);
        this.cadena = director;
    }

    public void asignarTarea(Peticion peticion) {
        this.cadena.manejar(peticion);
    }
}
