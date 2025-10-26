package casosSemana2;
import java.util.Scanner;
public class CuentaBancaria {
	static Scanner sc = new Scanner(System.in);
	public static int deposito(int cuenta) {
		System.out.println("Ingresar monto a depositar");
		int deposito = sc.nextInt();
		sc.nextLine();
		if (deposito < 0) {
			System.out.println("El monto a depositar no puede ser menor a cero");
			return cuenta;
		}else {
			cuenta += deposito;
			return cuenta;
		}
	}
	public static int retiro(int cuenta) {
		System.out.println("Ingresar monto a retirar");
		int retiro = sc.nextInt();
		sc.nextLine();
		if (retiro <= 0 || retiro > cuenta) {
			System.out.println("El monto a retirar no puede ser cero o superar el saldo de la cuenta");
			return cuenta;
	    }else {
		cuenta -= retiro;
		return cuenta;
	    }
	}
	public static void main(String[] args) {
		int monto_de_cuenta = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			while(true) {
				 
		    System.out.println("---Banco---");
		    System.out.println("1. Realizar deposito");
		    System.out.println("2. Realizar retiro");
		    System.out.println("3. salir");
		    int eleccion = sc.nextInt();
		    sc.nextLine();
		    if (eleccion != 1 & eleccion != 2 & eleccion != 3) {
		    	System.out.println("numero ingresado no es correcto, intentar de nuevo");
		    	continue;
		    }
		    switch (eleccion){
		    case 1:
		    	monto_de_cuenta = deposito(monto_de_cuenta);
		    	System.out.println(monto_de_cuenta);
		    	break;
		    case 2:
		    	monto_de_cuenta = retiro(monto_de_cuenta);
		    	System.out.println(monto_de_cuenta);
		    	break;
		    case 3:
		    	return;
		    	
		    }break;
		  }
	   }
	}
}
