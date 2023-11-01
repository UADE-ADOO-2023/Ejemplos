package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public class Iteracion implements Instruccion {
    private Instruccion instruccion;
    private Integer cantidadIteraciones;

    public Iteracion(Instruccion instruccion, Integer cantidadIteraciones) {
        this.instruccion = instruccion;
        this.cantidadIteraciones = cantidadIteraciones;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

    public Instruccion getInstruccion() {
        return instruccion;
    }

    public Integer getCantidadIteraciones() {
        return cantidadIteraciones;
    }
}
