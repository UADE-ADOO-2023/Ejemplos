package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class Profesor extends ManejadorPeticion{
    public Profesor(ManejadorPeticion siguienteManejador) {
        super(siguienteManejador);
    }

    @Override
    public void manejar(Peticion peticion) {
        if (peticion.esDeTipo(TipoPeticion.CLASE)) {
            System.out.println("Profesor manejando peticion: " + peticion.getDescripcion());
        } else if (this.siguienteManejador != null){
            this.siguienteManejador.manejar(peticion);
        }
    }
}
