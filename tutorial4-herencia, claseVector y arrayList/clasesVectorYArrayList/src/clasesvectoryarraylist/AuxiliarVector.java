package clasesvectoryarraylist;

import java.util.Enumeration;
import java.util.Vector;

public class AuxiliarVector {
    Vector lista = new Vector();
    
    void rellena(){
        lista.add("Uno");
        lista.add(2);
        lista.add(3.4);
        String palabras = "Hola que tal";
        lista.add(palabras);
        String[] array = new String[]{"enero","febrero","marzo"};
        lista.add(array);
    }
    void muestra(){
        System.out.println("La lista contiene : " + lista.size() + " elementos.");
        System.out.println("La capacidad maxima : " + lista.capacity());
        
        Enumeration e;
        System.out.println("Los elementos guardados son : ");
        for(e=lista.elements();e.hasMoreElements();){
            System.out.println(e.nextElement());
        }
        System.out.println("Los elementos bien mostrados son : ");
            for(e=lista.elements();e.hasMoreElements();){
            //1. Recuperamos el elemento en un objeto obj de la clase Object
            Object obj=e.nextElement();
            //2. ¿Tú qué eres?
            if(obj instanceof String[]){
                // Es un caso raro
                String[] arrayRaro =(String[])obj;
                for(int i=0;i<arrayRaro.length;i++){
                    System.out.print(arrayRaro[i] + " ");
                }
            }else{
                // Imprimo normal
                System.out.println(obj);
            }
        }
    }
}