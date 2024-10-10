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

    //Constructor vacio
    public Videojuegos() {
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getDesarrollador() {
        return desarrollador;
    }
    public String getPlataformas() {
        return plataformas;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

}

