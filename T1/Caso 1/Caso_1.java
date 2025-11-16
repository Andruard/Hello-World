package t1;

public class Caso_1 {
	public static void main(String[] args) {
        Autor GMC = new Autor("Gabriel", "García Márquez", "Colombia");
        Autor JVF = new Autor("Julio", "Verne", "Francia");
        Autor MCE = new Autor("Miguel", "De Cervantes Saavedra", "España");
        //registro de libro con ISBN
        Libro libro1 = new Libro("10 mil leguas de viaje submarino", JVF, 1870, "abc-341");
        //registro de libro sin ISBN
        Libro libro2 = new Libro("100 años de soledad", GMC, 1967);
        
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        
        //intento de registrar libro sin titulo (debe de dar una excepción)
        Libro libro3 = new Libro("", MCE, 1605, "bfe-123");
        
        libro3.mostrarInformacion();
        
	}
}
	
