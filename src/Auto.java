public class Auto {
    String nombre;
    String marca;
    String modelo;
    int anio;

    //constructor
    public Auto(String nombre, String marca, String modelo, int anio) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("-----------------------------------");
    }
}
