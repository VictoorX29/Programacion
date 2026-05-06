package vectores;

public class Libro {
    // Atributs de la clase Libro;
    String titulo,autor;
    int paginas;
    
    // Métodos de la clase Libro;
    String obtenerInfo(){
        return(this.titulo + " del autor " + this.autor + " tiene " + this.paginas);
    }
}
