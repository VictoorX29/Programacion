package examen;

import java.util.Enumeration;
import java.util.Vector;

public class Torneo {
    int dia, mes, anyo;
    String nombreTorneo;
    Vector datos = new Vector();
    void mostrarDatosTorneo(){
        datos.add(this.dia);
        datos.add(this.mes);
        datos.add(this.anyo);
        datos.add(this.nombreTorneo);
        Enumeration e;
        System.out.print("\nEl ");
        for(e=datos.elements();e.hasMoreElements();){
            Object dato = new Object();
            dato=e.nextElement();
            if(dato instanceof int){
                System.out.print(dato + " ");
            }
            if(dato instanceof String){
                System.out.print("se jugara el torneo : " + dato + ".\n");
            }
        }
    }
    public Torneo(){
        
    }
    public Torneo(int dia, int mes, int anyo, String nombreTorneo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.nombreTorneo = nombreTorneo;
    }
}
