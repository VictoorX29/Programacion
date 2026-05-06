package setgetscanner;

import java.util.Scanner;

public class SetGetScanner {
    
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.nombre="Victor";
        p1.apellido="Martinez";
        p1.edad=18;
        System.out.println(p1.nombre + " " + p1.apellido + " tiene " + p1.edad + ".");
        System.out.println(p1.obtenerInfo());
        
        Persona p2=new Persona();
        p2.setNombre("Joel");
        p2.setApellido("Caballero");
        p2.setEdad(69);
        
        System.out.println(p2.getNombre() + " " + 
                p2.getApellido() + " tiene " + 
                p2.getEdad() + " anyos.");
        
        
        Persona p3 = new Persona();
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce tu edad : ");
        p3.setEdad(lector.nextInt());
        lector.nextLine(); // Limpiamos el lector
        System.out.print("Introduce tu nombre : "); 
        p3.nombre=lector.nextLine();
        System.out.print("Introduce tu apellido : ");
        p3.setApellido(lector.nextLine());
        
        System.out.println(p3.obtenerInfo());
    }
}
