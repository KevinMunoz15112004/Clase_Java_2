public class Transporte {
    String nombre;
    String tipoCombustible;
    int capacidad;

    //constructor
    public Transporte(String nombre, String tipoCombustible, int capacidad) {
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.capacidad = capacidad;
    }

    //metodos personalizado
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo Combustible: " + this.tipoCombustible);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("-----------------------------------");
    }
}
