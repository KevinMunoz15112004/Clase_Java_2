public class InstrumentoMusical {
    String nombre;
    String modelo;
    double precio;

    //constructor
    public InstrumentoMusical(String nombre, String modelo, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Precio: " + this.precio);
        System.out.println("-----------------------------------");
    }
}
