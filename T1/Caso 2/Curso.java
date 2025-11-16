package t1_1;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;

    public Curso(String nombreCurso, String codigoCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
    }

  //reemplaza el metodo toString() 
    @Override
    public String toString() {
        return nombreCurso + " (" + codigoCurso + ")";
    }
}
