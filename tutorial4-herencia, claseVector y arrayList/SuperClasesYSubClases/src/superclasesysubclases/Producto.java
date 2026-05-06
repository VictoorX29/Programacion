package superclasesysubclases;

public class Producto {
    // Atributos de Producto
    int id;
    double precio;
    String nombre;
    //Constructores
    public Producto(){
        
    }
    public Producto(int ident, double pvp, String name){
        this.id=ident;
        this.precio=pvp;
        this.nombre=name;
    }
    void display(){
        System.out.println("Id: " + this.id + "\tNombre: " + this.nombre + "\tPrecio: " + this.precio);
    }
}
