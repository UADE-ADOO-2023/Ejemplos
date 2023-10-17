package ar.edu.uade.adoo.ejemplos.patrones.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ejecutar() {
        this.command.ejecutar();
    }
}
