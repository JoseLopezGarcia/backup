package clases;
public class Producto {
    private String CodBarra;
    private String nombre;
    private double costo;

    public Producto() {
    }
    
    public String getCodBarra() {
        return CodBarra;
    }

    public void setCodBarra(String CodBarra) {
        this.CodBarra = CodBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}