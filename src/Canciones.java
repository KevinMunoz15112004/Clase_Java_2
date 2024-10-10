public class Canciones {
    String Nombre;
    String Artista;
    String Genero;
    String Duracion;
    int Anio;

    //constructor

    public Canciones(String nombre, String artista, String genero, String duracion, int anio) {
        Nombre = nombre;
        Artista = artista;
        Genero = genero;
        Duracion = duracion;
        Anio = anio;
    }

    //constructor vacío
    public Canciones() {
    }

    //getters
    public int getAnio() {
        return Anio;
    }
    public String getDuracion() {
        return Duracion;
    }
    public String getGenero() {
        return Genero;
    }
    public String getArtista() {
        return Artista;
    }
    public String getNombre() {
        return Nombre;
    }

    //setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setArtista(String artista) {
        Artista = artista;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    public void setDuracion(String duracion) {
        Duracion = duracion;
    }
    public void setAnio(int anio) {
        Anio = anio;
    }
}
