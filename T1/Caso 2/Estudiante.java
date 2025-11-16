package t1_1;

//se realiza el contrato con evaluable y se requiere que todas las herencias usen el metodo evaluar()
public abstract class Estudiante implements Evaluable {

    protected String nombre;
    protected String codigo;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // método polimórfico
    public abstract double calcularMensualidad();

    //reemplaza el metodo toString() 
    @Override
    public String toString() {
        return nombre + " (Código: " + codigo + ")";
    }
}
