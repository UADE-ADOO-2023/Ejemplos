package ar.edu.uade.adoo.ejemplos.patrones.templatemethod;

public class Main {
    public static void main(String [] args) {
        Trabajador estudiante = new Estudiante();
        Trabajador profesor = new Profesor();
        estudiante.realizarRutina();
        profesor.realizarRutina();
    }
}
