package co.edu.uniquindio.poo;

public class Proveedor {
    private String nombre;
    private String id;

    public Proveedor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Proveedor [nombre=" + nombre + ", id=" + id + "]";
    }

    

    
    
}
