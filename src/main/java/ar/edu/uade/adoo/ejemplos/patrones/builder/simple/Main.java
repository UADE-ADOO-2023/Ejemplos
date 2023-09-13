package ar.edu.uade.adoo.ejemplos.patrones.builder.simple;

public class Main {
    public static void main(String [] args) {
        UsuarioBuilder builder = new UsuarioBuilder("Ana", "Martinez");
        Usuario ana = builder.build();
        System.out.println(ana.toString());
        Usuario carolina = new UsuarioBuilder("Carolina", "Martinez").edad(25).direccion("Lima 775").build();
        System.out.println(carolina.toString());
    }
}
