package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class Estudiante extends ManejadorPeticion{
    public Estudiante(ManejadorPeticion siguienteManejador) {
        super(siguienteManejador);
    }

    @Override
    public void manejar(Peticion peticion) {
        if (peticion.esDeTipo(TipoPeticion.TAREA)) {
            System.out.println("Estudiante manejando peticion: " + peticion.getDescripcion());
        } else if (this.siguienteManejador != null){
            this.siguienteManejador.manejar(peticion);
        }
    }
}
