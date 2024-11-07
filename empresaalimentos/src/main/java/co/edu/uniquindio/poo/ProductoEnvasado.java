package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto {
    private LocalDate fechaEnvasado;
    private double peso;
    private Pais pais;

    public ProductoEnvasado(String codigo, String nombre, double precio, Proveedor proveedor, LocalDate fechaEnvasado,
            double peso, Pais pais) {
        super(codigo, nombre, precio, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ProductoEnvasado [fechaEnvasado=" + fechaEnvasado + ", peso=" + peso + ", pais=" + pais + "]";
    }

    

    

    
}
