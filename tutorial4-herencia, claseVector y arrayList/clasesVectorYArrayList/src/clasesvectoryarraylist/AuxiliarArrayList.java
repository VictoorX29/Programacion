package clasesvectoryarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AuxiliarArrayList {
    ArrayList<String> lista = new ArrayList<String>();
    
    void rellena(){
        lista.add("Uno");
        lista.add(String.valueOf(2));
        lista.add(String.valueOf(3.4));
        String palabras = "Hola que tal";
        lista.add(palabras);
    }
    
    void muestra(){
        System.out.println("\nLos elementos del ArrayList son : ");
        Iterator<String> indicador;
        for(indicador=lista.iterator();indicador.hasNext();){
            System.out.println(indicador.next() + " ");
        }
    }
}
