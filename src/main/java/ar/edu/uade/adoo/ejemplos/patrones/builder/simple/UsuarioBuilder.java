package ar.edu.uade.adoo.ejemplos.patrones.builder.simple;

public class UsuarioBuilder {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String direccion;

    //Alternativamente
    private Usuario usuario;

    public UsuarioBuilder(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }
    public UsuarioBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }
    public UsuarioBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Usuario build() {
        Usuario usuario = new Usuario(this);
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
