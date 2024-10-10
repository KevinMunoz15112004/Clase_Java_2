public class Videojuegos {
    String nombre;
    String desarrollador;
    String plataformas;
    String clasificacion;
    int anioPublicacion;

    public Videojuegos(String nombre, String desarrollador, String plataformas, String clasificacion, int anioPublicacion) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.plataformas = plataformas;
        this.clasificacion = clasificacion;
        this.anioPublicacion = anioPublicacion;
    }
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Desarrollador: " + this.desarrollador);
        System.out.println("Plataformas: " + this.plataformas);
        System.out.println("Clasificacion: " + this.clasificacion);
        System.out.println("Año Publicacion: " + this.anioPublicacion);
        System.out.println("----------------------------------------");
    }
}
