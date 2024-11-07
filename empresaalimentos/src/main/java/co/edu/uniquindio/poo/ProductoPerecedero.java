package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String codigo, String nombre, double precio, Proveedor proveedor, String fechaVencmiento){
        super(codigo, nombre, precio, proveedor);
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }



    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
    public String toString() {
        return "ProductoPerecedero [fechaVencimiento=" + fechaVencimiento + "]";
    }

    

    
    
}
