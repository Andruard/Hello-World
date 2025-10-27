package ejercicios;
import java.util.Scanner;
//crea una excepcion personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class Excepciones {

	public static void main(String[] args) {
		Excepciones exc = new Excepciones();
		System.out.println("Ingrese un número positivo:");
		exc.comprobacion();
	}
	//hace las comprobaciones de el número ingresado
	public void comprobacion() {
        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine();
            int num = Integer.parseInt(input);

            if (num < 0) {
            	sc.close();
                throw new NumeroNegativoException("Error: El número no puede ser negativo");
            }

            System.out.println("Número válido ingresado: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un valor numérico entero");

        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
