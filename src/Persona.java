public class Persona {
    String nombre;
    String profesion;
    int edad;

    //constructor
    public Persona(String nombre, String profesion, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
    }

    //metodo personalizado
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Profesion: "+profesion);
        System.out.println("Edad: "+edad);
        System.out.println("-----------------------------------");
    }
}
