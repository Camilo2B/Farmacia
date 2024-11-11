package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Envasado extends Producto {
    private LocalDate fechaEnvasado;
    private double peso;
    private Pais pais;

    public Envasado(String codigo, String nombre, double precio, LocalDate fechaEnvasado,
            double peso, Pais pais) {
        super(codigo, nombre, precio);
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
        return "ProductoEnvasado [fechaEnvasado=" + fechaEnvasado + ", peso=" + peso + ", pais=" + pais + "]"+super.toString();
    }

    

    

    
}
