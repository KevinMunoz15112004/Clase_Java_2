public class Zapato {
    String marca;
    String serie;
    String anioLanzamiento;
    int talla;

    //constructor
    public Zapato(String marca, String serie, String anioLanzamiento, int talla) {
        this.marca = marca;
        this.serie = serie;
        this.anioLanzamiento = anioLanzamiento;
        this.talla = talla;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Serie: " + this.serie);
        System.out.println("Año de Lanzamiento: " + this.anioLanzamiento);
        System.out.println("Talla: " + this.talla);
        System.out.println("-----------------------------------");
    }
}
