
public class Main {
    public static void main(String[] args) {
        //Objetos para la clase Auto
        Auto auto1= new Auto("Chevrolet Corsa", "Chevrolet", "Corsa 2GEN", 2000);
        Auto auto2= new Auto("Toyota Rev", "Toyota","Modelo 3", 2018);

        //Objetos para la clase Canciones
        Canciones cancion1= new Canciones("Imagine","John Lenon", "Rock","3:20",1971);
        Canciones cancion2= new Canciones("Shape of You", "Ed Sheran","Pop", "3:53",2017);

        //Objetos para la clase InstrumentoMusical
        InstrumentoMusical instrumento1= new InstrumentoMusical("Guitarra Eléctrica","Fender Stratocaster",1200.70);
        InstrumentoMusical instrumento2= new InstrumentoMusical("Batería Acústica", "Yamaha Stage", 950.55);

        //Objetos para la clase Materia
        Materia materia1= new Materia("Programacion", "TDSD214", 4);
        Materia materia2= new Materia("Desarrollo Web", "TDSD414", 4);

        //Objetos para la clase Pelicula
        Pelicula pelicula1= new Pelicula("Inception","Chritopher Nolan","Ciencia Ficción",2010);
        Pelicula pelicula2= new Pelicula("Spider-Man: No Way Home", "Marvel", "Acción", 2021);

        //Objetos para la clase Persona
        Persona persona1= new Persona("Juan Pérez", "Ingeniero Eléctrico", 31);
        Persona persona2= new Persona("Kevin Muñoz", "Desarrollador", 25);

        //Objetos para la clase Serie
        Serie serie1= new Serie("Breaking Bad", "Crimen",2008,9.8);
        Serie serie2= new Serie("The Office", "Comedia",2005,9);

        //Objetos para la clase Transporte
        Transporte transporte1= new Transporte("Toyota Prius","Diesel",41);
        Transporte transporte2= new Transporte("Ford F-150","Super",5);

        //Objetos para la clase Videojuegos
        Videojuegos juego1= new Videojuegos("Elden Ring", "FromSoftware", "PC-PS5-PS4-XSX-XSS","+17",2022);
        Videojuegos juego2= new Videojuegos("Spider-Man","Insomniac Games", "PC-PS4-PS5","+17",2018);

        //Objetos para la clase Zapato
        Zapato zapato1= new Zapato("Nike Air Force 1","Air Force","1982",41);
        Zapato zapato2= new Zapato("Puma Suede Classic","Suede", "1968", 47);

        System.out.println("-----------AUTOS----------");
        auto1.imprimir();
        auto2.imprimir();

        System.out.println("-----------CANCIONES----------");
        cancion1.imprimir();
        cancion2.imprimir();

        System.out.println("-----------INSTRUMENTOS MUSICALES----------");
        instrumento1.imprimir();
        instrumento2.imprimir();

        System.out.println("-----------MATERIAS----------");
        materia1.imprimir();
        materia2.imprimir();

        System.out.println("-----------PELICULAS----------");
        pelicula1.imprimir();
        pelicula2.imprimir();

        System.out.println("-----------PERSONAS----------");
        persona1.imprimir();
        persona2.imprimir();

        System.out.println("-----------SERIES----------");
        serie1.imprimir();
        serie2.imprimir();

        System.out.println("-----------TRANSPORTES----------");
        transporte1.imprimir();
        transporte2.imprimir();

        System.out.println("-----------VIDEOJUEGOS----------");
        juego1.imprimir();
        juego2.imprimir();

        System.out.println("-----------ZAPATOS----------");
        zapato1.imprimir();
        zapato2.imprimir();

    }
}



