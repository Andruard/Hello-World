package t1_1;

public class caso_2 {
	public static void main(String[] args) {

        Estudiante e1 = new EstudianteRegular("Miguel Herencia", "N0012212");
        Estudiante e2 = new EstudianteBecado("Hector Mendez", "B0123123", 0.5);

        Curso curso = new Curso("Matemáticas", "MAT-1011");

        System.out.println(e1);
        System.out.println("Mensualidad: " + e1.calcularMensualidad());
        e1.evaluar();

        System.out.println();

        System.out.println(e2);
        System.out.println("Mensualidad: " + e2.calcularMensualidad());
        e2.evaluar();

        System.out.println();
        System.out.println("Curso registrado: " + curso);
    }

}
