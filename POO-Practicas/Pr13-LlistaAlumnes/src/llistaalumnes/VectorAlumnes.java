package llistaalumnes;

import java.util.Vector; 
import java.util.Scanner;
import java.util.Enumeration;

public class VectorAlumnes {
    Vector alumnes = new Vector();
    Scanner leer = new Scanner(System.in);
    void anadir(){
        Vector alumno = new Vector();
        System.out.print("Introduce el nombre : ");
        alumno.add(leer.nextLine());
        System.out.print("Introduce el primer apellido : ");
        alumno.add(leer.nextLine());
        System.out.print("Introduce el segundo apellido : ");
        alumno.add(leer.nextLine());
        System.out.print("Introduce la nota : ");
        alumno.add(leer.nextDouble());
        leer.nextLine();
        alumnes.add(alumno);
    }
    void mostrar(){
        System.out.println("Los alumnos son : ");
        Enumeration e;
        for(e=alumnes.elements();e.hasMoreElements();){
            Object obj=e.nextElement();
            if(obj instanceof Vector){
                Vector alumno = (Vector)obj;
                Enumeration eA;
                for(eA=alumno.elements();eA.hasMoreElements();){
                    Object objA = eA.nextElement();
                    if(objA instanceof String){
                        System.out.print(objA + " ");
                    }
                    if(objA instanceof Double){
                        System.out.println("\tNota : " + objA);
                    }
                }
            }else{
                
            }
        }
    }
}
