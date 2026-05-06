package superclasesysubclases;

public class SuperClasesYSubClases {

    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Patatas";
        p.id=1;
        p.precio=1.5;
        
        Producto p2 = new Producto(2,7,"Kiwis");
        p.display();
        p2.display();
        Comida c = new Comida(3,2.5,"Yogures",23,4,2026);
        //c.display();
        c.muestra();
    }
}
