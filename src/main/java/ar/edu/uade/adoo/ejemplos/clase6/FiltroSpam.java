package ar.edu.uade.adoo.ejemplos.clase6;

public class FiltroSpam implements FiltroMensaje{
    private FiltroMensaje siguiente;
    private SpamClassifier classifier;


    public FiltroSpam() {
        this.classifier = new SpamClassifier();
    }

    @Override
    public Mensaje filtrarMensaje(Mensaje mensaje) {
        if(classifier.classify(mensaje.getMensaje()).equals("YES")) {
            mensaje.setMensaje("Censurado!");
        }
        if (this.siguiente != null) {
            return this.siguiente.filtrarMensaje(mensaje);
        }
        return mensaje;
    }

    @Override
    public void setSiguienteEslabon(FiltroMensaje mensaje) {
        this.siguiente = mensaje;
    }

    @Override
    public FiltroMensaje getSiguienteEslabon() {
        return siguiente;
    }
}
