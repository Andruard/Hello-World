package ejercicios;
import java.util.ArrayList;
class Producto {
	    String nombre;	    
	    int precio;
	    int cantidad;

	    public Producto (String nombre, int precio, int cantidad) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.cantidad = cantidad;
	    }
	    //sobrescribe el metodo toString para que de la forma indicada
	    @Override
	    public String toString() {
	        return "Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad;
	    }

}
public class Inventario{
	public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto("Bolsa de Arroz");
        inventario.agregarProducto("Zanahorias", 2);
        inventario.agregarProducto("Platanos", 5, 45);
        //estos imprimirán error
        inventario.agregarProducto("Papas", -200); 
        inventario.agregarProducto("Cebollas", 7, -3);  
        //imprime el inventario
        inventario.mostrarProducto();
    }
	ArrayList<Producto> item = new ArrayList<>();
	//agrega los productos solo usando el nombre
	public void agregarProducto(String a) {
		item.add(new Producto(a, 0, 0));
	}
	//agrega los productos usando nombre y precio
	public void agregarProducto(String a, int b) {
		if (b < 0) {
			System.out.println("Error! el precio no puede ser negativo");
			return;
		}
		item.add(new Producto(a, b, 0));
	}
	//agrega los producots usando nombre, precio y cantidad
	public void agregarProducto(String a, int b, int c) {
		if (b < 0 || c < 0) {
			System.out.println("Error! el precio y la cantidad no pueden ser negativo");
			return;
		}
		item.add(new Producto(a, b, c));
	}
	//muestra los productos
	public void mostrarProducto() {
		System.out.println("\n----- Inventario -----");
		for (Producto p : item) {
			System.out.println(p);
		}
	}
}
	    
