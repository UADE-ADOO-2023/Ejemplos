package ar.edu.uade.adoo.ejemplos.patrones.templatemethod;

public class Main {
    public static void main(String [] args) {
        Trabajador estudiante = new Estudiante();
        Trabajador profesor = new Profesor();
        System.out.println("RUTINA ESTUDIANTE");
        estudiante.realizarRutina();
        System.out.println("RUTINA PROFESOR");
        profesor.realizarRutina();
    }
}
