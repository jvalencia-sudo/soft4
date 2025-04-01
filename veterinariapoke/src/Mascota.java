import java.time.LocalDate;
import java.util.List;

public class Mascota {

    private int id;
    private String nombre;
    private String tipo;
    private LocalDate fechaNacimiento;
    private Cliente cliente;
    private List<Aplicacion> aplicaciones;
    private List<HistorialEstado> historialEstados;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String tipo, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Aplicacion> getAplicaciones() {
        return this.aplicaciones;
    }

    public void setAplicaciones(List<Aplicacion> aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    public List<HistorialEstado> getHistorialEstados() {
        return this.historialEstados;
    }

    public void setHistorialEstados(List<HistorialEstado> historialEstados) {
        this.historialEstados = historialEstados;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}