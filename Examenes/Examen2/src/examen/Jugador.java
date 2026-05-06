package examen;

import java.util.Random;

public class Jugador extends Torneo{
    int[] puntuaciones = new int[5];
    int[] puntuacionesRival = new int[5];
    double inscripcion;
    Random r = new Random();
    
    void mostrarPuntuaciones(){
        System.out.print("\nTus puntuaciones son : ");
        for(int i = 0; i < puntuaciones.length; i++){
            System.out.print(puntuaciones[i] + " ");
        }
    }
    void mostrarPuntuaciones(int[] rival){
        System.out.print("\nLas puntuaciones del rival son : ");
        for (int i = 0; i < rival.length; i++) {
            System.out.print(rival[i] + " ");
        }
    }
    void generarPuntuacionesRival(){
        for (int i = 0; i < this.puntuacionesRival.length; i++) {
            this.puntuacionesRival[i]=r.nextInt(101);
        }
    }
    double calcularResultado(){
        double premio = 0;
        int rondas = 0;
        for (int i = 0; i < this.puntuaciones.length; i++) {
            if(this.puntuaciones[i]>=this.puntuacionesRival[i]){
                rondas++;
            }
        }
        switch (rondas) {
            case 1:
                premio=this.inscripcion;
                break;
            case 2:
                premio=this.inscripcion*2;
                break;
            case 3:
                premio=this.inscripcion*4;
                break;
            case 4:
                premio=this.inscripcion*10;
                break;
            case 5:
                premio=this.inscripcion*50;
                break;
            default:
                premio=0;
        }
        return premio;
    }
    public Jugador(){
        
    }
    public Jugador(int dia, int mes, int anyo, String nombreTorneo){
        super(dia,mes,anyo,nombreTorneo);
    }
}
