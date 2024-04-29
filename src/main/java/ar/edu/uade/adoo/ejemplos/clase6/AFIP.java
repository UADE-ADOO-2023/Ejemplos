package ar.edu.uade.adoo.ejemplos.clase6;

public class AFIP extends Sujeto {
    private Float impuesto = 1f;
    public void subirImpuesto() {
        impuesto++;
        this.notificar();
    }
}
