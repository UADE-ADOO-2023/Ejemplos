package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public class Parser implements Visitor{
    @Override
    public void visitar(Asignacion asignacion) {
        System.out.println("Parseando asignacion");
        System.out.println("Variable: " + asignacion.getNombreVariable());
        System.out.println("Valor: " + asignacion.getValor());
    }

    @Override
    public void visitar(Condicional condicional) {
        System.out.println("Parseando condicional");
        System.out.println("Condicion: " + condicional.getCondicion());
    }

    @Override
    public void visitar(Iteracion iteracion) {
        System.out.println("Parseando iteracion");
        System.out.println("Iteracion: " + iteracion.getInstruccion());
        System.out.println("Cantidad: " + iteracion.getCantidadIteraciones());
    }
}
