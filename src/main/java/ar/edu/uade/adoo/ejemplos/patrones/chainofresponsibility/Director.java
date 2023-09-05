package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public class Director extends ManejadorPeticion{
    public Director(ManejadorPeticion siguienteManejador) {
        super(siguienteManejador);
    }

    @Override
    public void manejar(Peticion peticion) {
        if (peticion.esDeTipo(TipoPeticion.ADMINISTRATIVO)) {
            System.out.println("Director manejando peticion: " + peticion.getDescripcion());
        } else if (this.siguienteManejador != null){
            this.siguienteManejador.manejar(peticion);
        }
    }
}
