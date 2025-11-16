package t1_1;

public class EstudianteRegular extends Estudiante {

    public EstudianteRegular(String nombre, String codigo) {
        super(nombre, codigo);
    }

  //reemplaza el metodo de la clase padre
    @Override
    public double calcularMensualidad() {
        return 500.00;  // Mensualidad base
    }

  //usa el metodo evaluar por contrato
    @Override
    public void evaluar() {
        System.out.println(nombre + " rinde una evaluación regular.");
    }
}
