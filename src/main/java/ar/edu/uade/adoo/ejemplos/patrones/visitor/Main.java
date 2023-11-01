package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public class Main {
    public static void main(String[] args) {
        Asignacion asignacion = new Asignacion("x", "10");
        Condicional condicional = new Condicional("x < 10");
        Iteracion iteracion = new Iteracion(asignacion, 10);
        Visitor scanner = new Scanner();
        scanner.visitar(iteracion);
        Visitor parser = new Parser();
        parser.visitar(condicional);
    }
}
