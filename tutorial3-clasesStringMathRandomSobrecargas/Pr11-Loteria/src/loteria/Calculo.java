package loteria;

import java.util.*;

public class Calculo {
    int[][] boleto = new int[8][6];
    Scanner leer = new Scanner(System.in);
    int n;
    
    void ferComb(String modo){
        if(modo=="manual"){
            this.boleto=this.manual();
            for (int i = 0; i < this.boleto[0].length; i++) {
                System.out.print(this.boleto[0][i] + "\t");    
            }
            System.out.println("\n");
        }else if(modo=="automatico"){
            
        }
    }
    int[][] manual(){
        int[][] fila = new int[1][6];
        int n;
        Boolean repe;
        for(int i = 0 ; i < fila[0].length ; i++){
            repe=false;
            do {
                Boolean ncor=true;
                do {
                    System.out.print("Introduce el numero del 1 al 49 en la posicion " + i + " : ");
                    n=leer.nextInt();
                    if(n>=1||n<=49){
                        ncor=false;
                        for (int j = i; j >= 0; j--) {
                            if(n==fila[0][j]){
                                System.out.println("El numero que has introducido y el de la posicion " + j + " son el mismo.");
                                repe=true;
                            }else{
                                repe=false;
                                fila[0][i]=n;
                            }
                        }
                    }
                } while (ncor==true);
            } while (repe==true);   
        }
        return fila;
    }
    
}
