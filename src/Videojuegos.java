public class Videojuegos {
    String nombre;
    String desarrollador;
    String plataformas;
    String clasificacion;
    int anioPublicacion;

    //constructor con parámetros
    public Videojuegos(String nombre, String desarrollador, String plataformas, String clasificacion, int anioPublicacion) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.plataformas = plataformas;
        this.clasificacion = clasificacion;
        this.anioPublicacion = anioPublicacion;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Desarrollador: " + this.desarrollador);
        System.out.println("Plataformas: " + this.plataformas);
        System.out.println("Clasificacion: " + this.clasificacion);
        System.out.println("Anio Publicacion: " + this.anioPublicacion);
        System.out.println("-----------------------------------");
    }

}

