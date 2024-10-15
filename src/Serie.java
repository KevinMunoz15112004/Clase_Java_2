public class Serie {
    String nombre;
    String genero;
    int anio;
    double calificacion;

    //constructor
    public Serie(String nombre, String genero, int anio, double calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    //metodo personalizado
    public void imprimir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Genero: " + this.genero);
        System.out.println("Anio: " + this.anio);
        System.out.println("Calificacion: " + this.calificacion);
        System.out.println("-----------------------------------");
    }
}
