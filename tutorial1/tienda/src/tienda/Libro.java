package tienda;

public class Libro {
    // Definimos los atributos de la clase Libro
    int paginas;
    String titulo;
    String autor;
    float precio;
    boolean vendido=false;
    
    // Definimos los métodos de la clase Libro
    void vender(){
        this.vendido=true;
    }
    String obtenerInfo(){
        String texto,mensaje;
        if(this.vendido==true){
            mensaje="y si esta vendido";
        }else{
            mensaje="y no esta vendido";
        }
        texto ="El libro " + this.titulo + " del autor " + this.autor + 
                " tiene " + this.paginas + " paginas, vale " + this.precio + " euros "
                + mensaje + ".\n";
        return(texto);
    }
}
