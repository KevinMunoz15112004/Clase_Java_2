public class Materia {
    String nombre;
    String codMateria;
    int creditos;

    //constructor
    public Materia(String nombre, String codMateria, int creditos) {
        this.nombre = nombre;
        this.codMateria = codMateria;
        this.creditos = creditos;
    }

    //metodo personalizado
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo Materia: " + this.codMateria);
        System.out.println("Creditos: " + this.creditos);
        System.out.println("-----------------------------------");
    }
}
