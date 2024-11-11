package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Producto> productos;
    private LinkedList<Proveedor> proveedores;

    

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productos = new LinkedList<>();
        this.proveedores = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(LinkedList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarProveedor(Proveedor proveedor){
        proveedores.add(proveedor);
    }

    

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", productos=" + productos + ", proveedores=" + proveedores + "]";
    }


    public static void main(String[] args) {

        //Crear Empresa
        var Empresa = new Empresa("VasosPlus");

        //Crear proveedores
        var proveedor1 = new Proveedor("Juan", "10920192");
        var proveedor2 = new Proveedor("Esteban", "1092019283");
        Empresa.agregarProveedor(proveedor1);
        Empresa.agregarProveedor(proveedor2);

        //Crear productos perecedero
        var perecedero1 = new Perecedero("10291031", "Carne", 14.900, LocalDate.of(2025, 2, 4));
        var perecedero2 = new Perecedero("10451031", "Pollo", 12.300, LocalDate.of(2025, 4, 3));
        Empresa.agregarProducto(perecedero2);
        Empresa.agregarProducto(perecedero1);

        //Crear productos refrigerados
        var refrigerado1 = new Refrigerado("99821919", "Leche", 4.200, "01289282", 21.9);
        var refrigerado2 = new Refrigerado("99769919", "BonYurt", 5.000, "012124282", 19.2);
        Empresa.agregarProducto(refrigerado1);
        Empresa.agregarProducto(refrigerado2);

        //Crear productos Envasados
        var envasado1 = new Envasado("9182911", "Atun", 5.990, LocalDate.of(2024, 4, 25), 3.45, Pais.ARGENTINA);
        var envasado2 = new Envasado("918293821", "Maiz tierno", 7.200, LocalDate.of(2024, 7, 21), 5.12, Pais.CHILE);Empresa.agregarProducto(envasado1);
        Empresa.agregarProducto(envasado2);

        //mostrar
        System.out.println(Empresa.toString());


    }


}
