public class Serie {
    String nombre;
    String genero;
    int anio;
    float calificacion;

    //constructor
    public Serie(String nombre, String genero, int anio, float calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    //constructor vacío
    public Serie(){
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public float getCalificacion() {
        return calificacion;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}
