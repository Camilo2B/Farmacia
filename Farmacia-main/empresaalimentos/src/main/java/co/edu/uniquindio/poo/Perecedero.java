package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Perecedero extends Producto {
    private LocalDate fechaVencimiento;

    public Perecedero(String codigo, String nombre, double precio, LocalDate fechaVencimiento) {
        super(codigo, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }



    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }



    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
    public String toString() {
        return "ProductoPerecedero [fechaVencimiento=" + fechaVencimiento + "]"+super.toString();
    }

    

    
    
}
