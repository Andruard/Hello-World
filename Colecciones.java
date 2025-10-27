package ejercicios;
import java.util.ArrayList;
public class Colecciones {
	public static void main(String[] args) {
		Colecciones col = new Colecciones();
		ArrayList<String> nombresE = new ArrayList<>();
		//se agregan los 5 nombres
		nombresE.add("Miguel");
		nombresE.add("Laura");
		nombresE.add("Gladys");
		nombresE.add("Luciana");
		nombresE.add("Marcelo");
		//lista completa
		col.ImprimirNombre(nombresE);
		//se remueve el tercer nombre
		nombresE.remove(2);
		//se vuelve a imprimir
		col.ImprimirNombre(nombresE);
		}
	//imprime la lista completa
	public void ImprimirNombre(ArrayList <String> a) {
		System.out.println("------------------------------");
		System.out.println("Lista completa de estudiantes:");
		for (String nombre : a) {
			System.out.println(nombre);
		}
	}
}
