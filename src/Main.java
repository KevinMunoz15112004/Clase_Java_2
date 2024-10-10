
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1 = new Libro("El señor de los anillos","J. R. R. Tolkien","Books",233);
        Libro libro2 = new Libro("Cien años de soledad","Gabriel García", "Sudamericana", 175);
        Libro libro3 = new Libro("1984","George Orwell","IberLibro",174);
        Libro libro4 = new Libro("Un mundo feliz","Aldous Huxley","Penguin Libros",238);
        Libro libro5 = new Libro("Orgullo y prejuicio","Jane Austen","Ediciones Cátedra",341);

        libro1.imprimir();
        System.out.println(libro1.imprimirCubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimirCubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimirCubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimirCubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimirCubierta());

    }
}

