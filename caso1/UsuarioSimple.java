package casosSemana2;
import java.util.Scanner;
public class UsuarioSimple {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Insertar Nombre");
		 String nombre = sc.nextLine();
		 System.out.println("Buenos días "+ nombre);
		 System.out.println("Introducir edad");
		 int edad = 0;
		 edad = sc.nextInt();
		 sc.nextLine();
		 System.out.println("correo");
		 String correo = sc.nextLine();
		 System.out.println("Nombre: "+nombre+"\nEdad: "+edad+ "\nCorreo: "+correo);
		 System.out.println("Presionar enter para salir");
		 sc.nextLine();
		 sc.close();
	 }

}
