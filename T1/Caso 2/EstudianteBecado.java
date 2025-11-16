package t1_1;

public class EstudianteBecado extends Estudiante {

    private double porcentajeBeca; // 0.0 a 1.0 (ej: 0.25 = 25%)

    public EstudianteBecado(String nombre, String codigo, double porcentajeBeca) {
        super(nombre, codigo);
        this.porcentajeBeca = porcentajeBeca;
    }

  //reemplaza el metodo de la clase padre
    @Override
    public double calcularMensualidad() {
        double mensualidadBase = 500.00;
        return mensualidadBase - (mensualidadBase * porcentajeBeca);
    }

  //usa el metodo evaluar por contrato
    @Override
    public void evaluar() {
        System.out.println(nombre + " realiza evaluación con condiciones especiales por beca.");
    }
}
