package t1;

public class Libro {
    private String titulo;
    private Autor autor;
    private int año;
    private String isbn;

    //Constructor para registrar sin ISBN
    public Libro(String titulo, Autor autor, int año) {
    	validarTitulo(titulo);
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    //Constructor para registrar con ISBN
    public Libro(String titulo, Autor autor, int año, String isbn) {
    	validarTitulo(titulo);
    	this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.isbn = isbn;
    }
    //valida el titulo a la hora del registro
    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El libro debe tener un título.");
        }
    }
  
    //muestra la informacion del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.mostrarAutor());
        System.out.println("Año: " + año);
        System.out.println("ISBN: " + (isbn != null ? isbn : "No registrado"));
        System.out.println("------------------");
    }
}


