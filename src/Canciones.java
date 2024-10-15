public class Canciones {
    String Nombre;
    String Artista;
    String Genero;
    String Duracion;
    int Anio;

    //constructor

    public Canciones(String nombre, String artista, String genero, String duracion, int anio) {
        this.Nombre = nombre;
        this.Artista = artista;
        this.Genero = genero;
        this.Duracion = duracion;
        this.Anio = anio;
    }

    //metodo personalizado
    public void imprimir(){
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Artista: " + this.Artista);
        System.out.println("Genero: " + this.Genero);
        System.out.println("Duracion: " + this.Duracion);
        System.out.println("Anio: " + this.Anio);
        System.out.println("-----------------------------------");
    }
}
