package ejercicios;
public class Calculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int suma1 = calc.sumar(5, 10);        
	    int suma2 = calc.sumar(3, 7, 2);           
	    double suma3 = calc.sumar(4.5, 2.3);  
	    System.out.println("Calculadora:");
	    System.out.println("Suma de dos números (5, 10):");
	    System.out.println(suma1);
	    System.out.println("Suma de tres números (3, 7 y 2):");
	    System.out.println(suma2);
	    System.out.println("Suma de dos números decimales (4.5, 2.3):");
	    System.out.println(suma3);
	
	}
	//suma dos numeros
	public int sumar(int a, int b) {
	    return a + b;
	}
	//suma tres numeros
	public int sumar(int a, int b, int c) {
	    return a + b + c;
	}
	//suma dos numeros decimales
	public double sumar(double a, double b) {
	     return a + b;
	}
}
