package casosSemana2;
import java.util.Scanner;
public class EstudianteInteractivo {
	private String nombre;
	private int edad;
	private String curso;
	private int promedio;
	
	public EstudianteInteractivo(String nombre, int edad, String curso, int promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
		this.promedio = promedio;
	}
	public void MostrarDatos() {
		System.out.println("--- Datos del estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("Promedio: " + promedio);
	}
	//metodos get/set para recuperar datos de la clase
	public void ColocarNombre(String nombre) {
		this.nombre = nombre;
	}
	public void ColocarEdad(int edad) {
		this.edad = edad;
	}
	public void ColocarCurso(String curso) {
		this.curso = curso;
	}
	public void ColocarPromedio(int promedio) {
		this.promedio = promedio;
	}
	public String ObtenerNombre() {
		return nombre;
	}
	public int ObtenerEdad() {
		return edad;
	}
	public String ObtenerCurso() {
		return curso;
	}
	public int ObtenerPromedio() {
		return promedio;
	}
	//main creacion del estudiante
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingrese el curso: ");
        String curso = sc.nextLine();
        System.out.print("Ingrese el promedio (0-20): ");
        int promedio = sc.nextInt();
        EstudianteInteractivo est = new EstudianteInteractivo(nombre, edad, curso, promedio);
        est.MostrarDatos();
        sc.close();
	}

}
