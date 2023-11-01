package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public class Condicional implements Instruccion {
    private String condicion;

    public Condicional(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

    public String getCondicion() {
        return condicion;
    }
}
