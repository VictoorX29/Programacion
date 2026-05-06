package loteria;

import java.util.*;

public class Calculo {
    Scanner leer = new Scanner(System.in);
    int[][] boleto = new int[8][6];
    int[] jueves = new int[6];
    int[] sabado = new int[6];
    int rein, reinJ, reinS;
    Random rand = new Random();
    String sorteo, modo;
    int apuestas;
    Boolean controlApuestas, controlSorteo, controlModo;
    
    int[] ferComb(String modo){
        if(modo.equals("manual")){
            this.boleto[0]=this.manual();
            
        }else if(modo.equals("automatico")){
            this.boleto[0]=this.automatico();
        }
        return this.boleto[0];
    }
    int[][] ferComb(int cant, String modo){
        if(modo.equals("manual")){
            for (int i = 0; i < cant; i++) {
                System.out.println("\nApuesta " + i);
                this.boleto[i]=this.manual();
            }
        }else if(modo.equals("automatico")){
            for(int i = 0; i < cant; i++){
                this.boleto[i]=this.automatico();
            }
        }
        this.jueves=this.automatico();
        return this.boleto;
    }
    int[][] ferComb(int cant, String modo, String dias){
        if(modo.equals("manual")){
            for (int i = 0; i < cant; i++) {
                System.out.println("\nApuesta " + i);
                this.boleto[i]=this.manual();
            }
        }else if(modo.equals("automatico")){
            for(int i = 0; i < cant; i++){
                this.boleto[i]=this.automatico();
            }
        }
        this.jueves=this.automatico();
        return this.boleto;
    }
    int[] manual(){
        int n;
        Boolean error=false, repe=false;
        int[] fila = new int[6];
        for (int i = 0; i < fila.length; i++) {
            do {
                do {
                    System.out.print("Numero posicion " + i + " : ");
                    n=leer.nextInt();
                    if(n<1||n>49){
                        error=true;
                        System.out.println("Introduce un numero entre 1-49.");
                    }else{
                        error=false;
                    }
                } while (error);
                if(i>0){
                    repe=false;
                    for (int j = 0; j < i && repe==false; j++) {
                        if(fila[j]==n){
                            System.out.println("El numero que has introducido coincide con el de la posicion " + j + ".");
                            repe=true;
                        }
                    }
                }
            } while (repe);
            fila[i]=n;
        }
        return fila;
    }
    int[] automatico(){
        int n;
        Boolean repe=false;
        int[] fila = new int[6];
        for (int i = 0; i < fila.length; i++) {
            do {
                n=rand.nextInt(49)+1;
                if(i>0){
                    repe=false;
                    for (int j = 0; j < i && repe==false; j++) {
                        if(fila[j]==n){
                            repe=true;
                        }
                    }
                }
            } while (repe);
            fila[i]=n;
        }
        return fila;
    }
    int genRein(){
        return rand.nextInt(10);
    }
    void ferSorteig(String dias){
        if(dias.equals("jueves")||dias.equals("sabado")){
            if(dias.equals("jueves")){
                this.jueves=this.automatico();
                this.reinJ=this.genRein();
            }else{
                this.sabado=this.automatico();
                this.reinS=this.genRein();
            }
        }else{
            this.jueves=this.automatico();
            this.reinJ=this.genRein();
            this.sabado=this.automatico();
            this.reinS=this.genRein();
        }
    }
    int comprobar(int[] fila, int[] comprobacion){
        int num = 0;
        int i, j;
        for(i=0;i<fila.length;i++){
            for(j = 0;j < comprobacion.length;j++){
                if(fila[i]==comprobacion[j]){
                    num++;
                }
            }
        }
        return num;
    }
    Boolean comprobarRein(int rein1, int rein2){
        if(rein1==rein2){
            return true;
        }else{
            return false;
        }
    }
}
