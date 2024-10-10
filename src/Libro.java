public class Libro {
        // Atributos
        String titulo;
        String autor;
        String editorial;
        int paginas;
        //Métodos
            //Constructor
    public Libro(String titulo, String autor, String editorial, int paginas){
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.paginas = paginas;
        }

        //getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getEditorial() {
            return editorial;
        }

        public int getPaginas() {
            return paginas;
        }

        //setters

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }

    //metodos personalizados
        public void imprimir(){
            System.out.println("El título es: "+this.titulo);
            System.out.println("El autor es: "+this.autor);
            System.out.println("La editorial es: "+this.editorial);
            System.out.println("Las páginas son: "+this.paginas);
            System.out.println("-----------------------------------");
        }

        public int imprimirCubierta(){
            return this.paginas+5;
        }
    }
