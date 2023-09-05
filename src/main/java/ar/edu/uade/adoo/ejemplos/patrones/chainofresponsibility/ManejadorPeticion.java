package ar.edu.uade.adoo.ejemplos.patrones.chainofresponsibility;

public abstract class ManejadorPeticion {

    protected ManejadorPeticion siguienteManejador;

    public ManejadorPeticion(ManejadorPeticion siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    public abstract void manejar(Peticion peticion);
}
