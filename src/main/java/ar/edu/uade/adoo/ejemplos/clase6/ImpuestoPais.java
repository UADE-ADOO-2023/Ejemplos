package ar.edu.uade.adoo.ejemplos.clase6;

/**
 *
 */
public class ImpuestoPais extends Impuesto {

    /**
     * Default constructor
     */
    public ImpuestoPais() {
        this.valor = 0.45f;
    }

    /**
     * @param precioBase
     * @return
     */
    public Float getValorTotal(Float precioBase) {
        return (1 + this.valor) + precioBase;
    }
}
