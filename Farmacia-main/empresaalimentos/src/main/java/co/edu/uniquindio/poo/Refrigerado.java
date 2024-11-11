package co.edu.uniquindio.poo;

public class Refrigerado extends Producto implements iRefrigerado{
    private String codigoAprobacion;
    private double temperaturaRefrigeracion;

    public Refrigerado(String codigo, String nombre, double precio, String codigoAprobacion,
            double temperaturaRefrigeracion) {
        super(codigo, nombre, precio);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperaturaRefrigeracion() {
        return temperaturaRefrigeracion;
    }

    public void setTemperaturaRefrigeracion(double temperaturaRefrigeracion) {
        this.temperaturaRefrigeracion = temperaturaRefrigeracion;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoAprobacion=" + codigoAprobacion + ", temperaturaRefrigeracion="
                + temperaturaRefrigeracion + "]"+super.toString();
    }



    

    
    
}
