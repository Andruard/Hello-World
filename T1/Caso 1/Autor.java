package t1;

public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Autor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }
    //obtiene el nombre
    public String getNombre() {
        return nombre;
    }
    //obtiene el apellido
    public String getApellido() {
    	return apellido;
    }
    //obitene la nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }
    //muestra la informacion del autor
    public String mostrarAutor() {
        return nombre + " " + apellido + " (" + nacionalidad + ")";
    }
}
	

