package ar.edu.uade.adoo.ejemplos.patrones.builder.simple;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String direccion;
    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.nombre = usuarioBuilder.getNombre();
        this.apellido = usuarioBuilder.getApellido();
        this.edad = usuarioBuilder.getEdad();
        this.telefono = usuarioBuilder.getTelefono();
        this.direccion = usuarioBuilder.getDireccion();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
