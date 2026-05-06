package tienda;

public class Tienda {

    public static void main(String[] args) {
        // Instanciamos un objeto de la clase Libro
        Libro libro1= new Libro();
        libro1.titulo="100 anyos de soledad";
        libro1.autor="Gabriel Garcia Marquez";
        libro1.paginas=435;
        libro1.precio=(float) 47.25;
        String res;
        System.out.println("Libro al principio: ");
        res=libro1.obtenerInfo();
        System.out.println(res);
        
        // Vendemos el libro
        libro1.vender();
        System.out.println("Libro al final: ");
        System.out.println(libro1.obtenerInfo());
    }

}
