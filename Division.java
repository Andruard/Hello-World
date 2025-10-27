package ejercicios;
import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		Division div = new Division();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dividiendo:");
		System.out.println("insertar primer número:");
		int num1 = sc.nextInt();
		System.out.println("insertar segundo número:");
		int num2 = sc.nextInt();
		System.out.println(div.dividir(num1, num2));
		sc.close();
	}
	//divide y comprueba que la division sea factible
	public int dividir (int a, int b) {
		try {
		   return a / b;
		}catch(ArithmeticException e) {
			System.out.println("Error: división entre cero no permitida");
			return 0;
		}
	}

}
