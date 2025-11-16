package t1_2;

import java.util.ArrayList;

public class Caso_3 {
	public static void main(String[] args) {
	    ArrayList<Producto> productos = new ArrayList<>();
	    ArrayList<Venta> ventas = new ArrayList<>();

	    productos.add(new Producto("Tarjeta grafica 4070 RTX", 2500.0, 5));
	    productos.add(new Producto("Auriculares", 40.0, 20));

	    comprarProducto("Tarjeta grafica 4070 RTX", 2, productos, ventas);
	    comprarProducto("Auriculares", 10, productos, ventas); // stock insuficiente

	    for (Venta v : ventas) {
	        System.out.println(v.getResumen());
	    }
	}
    //compra productos con ingresar el nombre, la cantidad y las listas
	public static void comprarProducto(String nombre, int cantidad, ArrayList<Producto> productos, ArrayList<Venta> ventas) {
	    for (Producto p : productos) { //va por cada producto en la lista de productos
	        if (p.getNombre().equalsIgnoreCase(nombre)) { //revisa que el producto sea igual al elemento que se va a comprar

	            if (p.getStock() < cantidad) { //revisa que el stock sea mayor a la cantidad deseada
	                System.out.println("Stock insuficiente. Stock actual: " + p.getStock());
	                return;
	            }

	            // disminuye el stock
	            p.disminuirStock(cantidad);

	            // registra la venta en la lista de ventas
	            Venta v = new Venta(p.getNombre(), cantidad, p.getPrecio());
	            ventas.add(v);

	            System.out.println("Compra realizada con éxito");
	            return;
	        }
	    }

	    System.out.println("Producto no encontrado");
	}
}
