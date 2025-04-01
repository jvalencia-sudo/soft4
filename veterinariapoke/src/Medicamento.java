import java.time.LocalDate;
import java.util.List;

public class Medicamento {

    private int id;
    private String nombre;
    private int cantidadStock;
    private double precio;
    private LocalDate fechaVencimiento;
    private List<Aplicacion> aplicaciones;

    public Medicamento() {
    }

    public Medicamento(int id, String nombre, int cantidadStock, double precio, LocalDate fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadStock() {
        return this.cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public List<Aplicacion> getAplicaciones() {
        return this.aplicaciones;
    }

    public void setAplicaciones(List<Aplicacion> aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", cantidadStock='" + getCantidadStock() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", fechaVencimiento='" + getFechaVencimiento() + "'" +
                "}";
    }
}
