package t1_2;

public class Venta {
    private String nombreProducto;
    private int cantidad;
    private double precioUnidad;
    private double total;

    public Venta(String nombreProducto, int cantidad, double precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnitario;
        this.total = cantidad * precioUnitario;
    }
   
    public String getResumen() {
        return "Producto: " + nombreProducto +
               " | Cantidad: " + cantidad +
               " | Total: " + total;
    }
}