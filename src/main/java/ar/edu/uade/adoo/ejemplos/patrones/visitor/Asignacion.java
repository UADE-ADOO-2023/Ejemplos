package ar.edu.uade.adoo.ejemplos.patrones.visitor;

public class Asignacion implements Instruccion {
    private String nombreVariable;
    private String valor;

    public Asignacion(String nombreVariable, String valor) {
        this.nombreVariable = nombreVariable;
        this.valor = valor;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public String getValor() {
        return valor;
    }
}
