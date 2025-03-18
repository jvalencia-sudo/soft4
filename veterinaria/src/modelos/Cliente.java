package modelos;

import java.util.List;

public class Cliente {
    private long id;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private List<Mascota> mascotas;
    private Estado estadoActual;
    public Cliente() {}

    public Cliente(long id, String nombre, String telefono, String email, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public void agregarMascota(Mascota mascota) {
        if (mascotas.size() >= 5) {
            throw new IllegalStateException("No se pueden registrar más de 5 mascotas.");
        }
        mascotas.add(mascota);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}