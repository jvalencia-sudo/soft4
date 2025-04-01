import java.time.LocalDate;

public class Aplicacion {

    private Integer id;
    private String comentario;
    private LocalDate fechaAplicacion;
    private Medicamento medicamento;
    private Mascota mascota;
    private Empleado empleado;

    public Aplicacion() {
    }

    public Aplicacion(Integer id, String comentario, LocalDate fechaAplicacion) {
        this.id = id;
        this.comentario = comentario;
        this.fechaAplicacion = fechaAplicacion;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaAplicacion() {
        return this.fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public Medicamento getMedicamento() {
        return this.medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", comentario='" + getComentario() + "'" +
                ", fechaAplicacion='" + getFechaAplicacion() + "'" +
                "}";
    }

}
