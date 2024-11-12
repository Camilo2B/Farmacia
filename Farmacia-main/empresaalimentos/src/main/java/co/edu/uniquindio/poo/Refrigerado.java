package co.edu.uniquindio.poo;

public class Refrigerado extends Producto implements iRefrigerado{
    private String codigoAprobacion;
    private double temperatura;

    public Refrigerado(String codigo, String nombre, double precio, String codigoAprobacion,
            double temperatura) {
        super(codigo, nombre, precio);
        this.codigoAprobacion = codigoAprobacion;
        this.temperatura = temperatura;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoAprobacion=" + codigoAprobacion + ", temperatura de refrigeracion"
                + temperatura + "]"+super.toString();
    }

    



    

    
    
}
