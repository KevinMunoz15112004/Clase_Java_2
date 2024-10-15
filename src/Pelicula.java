public class Pelicula {
    String titulo;
    String autor;
    String genero;
    int anioPublicacion;

    //constructor
    public Pelicula(String titulo, String autor, String genero, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("Anio Publicacion: " + this.anioPublicacion);
        System.out.println("-----------------------------------");

    }
}
