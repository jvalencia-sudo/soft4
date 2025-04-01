import java.time.LocalDate;

public class HistorialEstado {

    private int id;
    private LocalDate fechaCambio;
    private Empleado empleado;
    private Mascota mascota;
    private Estado estado;

    public HistorialEstado() {
    }

    public HistorialEstado(int id, LocalDate fechaCambio, Empleado empleado, Mascota mascota, Estado estado) {
        this.id = id;
        this.fechaCambio = fechaCambio;
        this.empleado = empleado;
        this.mascota = mascota;
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaCambio() {
        return this.fechaCambio;
    }

    public void setFechaCambio(LocalDate fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "HistorialEstado{" +
                "id=" + id +
                ", fechaCambio=" + fechaCambio +
                ", estado=" + (estado != null ? estado.getId() : "null") +
                '}';
    }
}
