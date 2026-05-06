package loteria;

import java.util.*;

public class Loteria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculo n1 = new Calculo();
        int[][] boleto = new int[8][6];
        Boolean reinJ, reinS;
        do {
            System.out.print("Cuantas apuestas quieres? : ");
            n1.apuestas=leer.nextInt();
            leer.nextLine();
            if(n1.apuestas>8||n1.apuestas<1){
                System.out.println("Introduce un numero entre 1-8");
                n1.controlApuestas=false;
            }else{
                n1.controlApuestas=true;
            }
        } while (!n1.controlApuestas);
        do {
            System.out.println("Jueves/Sabado/Ambos");
            System.out.print("Para que dias quieres el sorteo : ");
            n1.sorteo=leer.nextLine().toLowerCase();
            if(!n1.sorteo.equals("jueves")&&!n1.sorteo.equals("sabado")&&!n1.sorteo.equals("ambos")){
                System.out.println("Introduce una de las opciones.");
                n1.controlSorteo=false;
            }else{
                n1.controlSorteo=true;
            }
        } while (!n1.controlSorteo);
        do {
            System.out.println("Manual/Automatico");
            System.out.print("Como quieres introducir los numeros de las apuestas : ");
            n1.modo=leer.nextLine().toLowerCase();
            if(!n1.modo.equals("manual")&&!n1.modo.equals("automatico")){
                System.out.println("Introduce una de las opciones.");
                n1.controlModo=false;
            }else{
                n1.controlModo=true;
            }
        } while (!n1.controlModo);
        if(n1.apuestas==1&&(n1.sorteo.equals("jueves")||n1.sorteo.equals("sabado"))){
            boleto[0]=n1.ferComb(n1.modo);
        }else{
            if(n1.sorteo.equals("jueves")){
                boleto=n1.ferComb(n1.apuestas, n1.modo);
            }else{
                boleto=n1.ferComb(n1.apuestas, n1.modo, n1.sorteo);
            }
        }
        System.out.println("\nTu boleto es : ");
        for (int i = 0; i < n1.apuestas; i++) {
            System.out.print("Apuesta " + i + ": ");
            for (int j = 0; j < boleto[0].length; j++) {
                System.out.print(boleto[i][j] + " ");
            }
            System.out.println("");
        }
        n1.rein=n1.genRein();
        System.out.println("Reintegro: " + n1.rein);
        n1.ferSorteig(n1.sorteo);
        if(n1.sorteo.equals("jueves")||n1.sorteo.equals("sabado")){
            if(n1.sorteo.equals("jueves")){
                System.out.print("\nJueves: ");
                for (int i = 0; i < n1.jueves.length; i++) {
                    System.out.print(n1.jueves[i] + " ");
                }
                System.out.println("\nReintegro: " + n1.reinJ);
            }else{
                System.out.print("\nSabado: ");
                for (int i = 0; i < n1.sabado.length; i++) {
                    System.out.print(n1.sabado[i] + " ");
                }
                System.out.println("\nReintegro: " + n1.reinS);
            }
        }else{
            System.out.print("\nJueves: ");
            for (int i = 0; i < n1.jueves.length; i++) {
                System.out.print(n1.jueves[i] + " ");
            }
            System.out.println("\nReintegro: " + n1.reinJ);
            System.out.print("Sabado: ");
            for (int i = 0; i < n1.sabado.length; i++) {
                System.out.print(n1.sabado[i] + " ");
            }
            System.out.println("\nReintegro: " + n1.reinS);
        }
        System.out.println("\nCOMPROBACION");
        if(n1.sorteo.equals("jueves")||n1.sorteo.equals("ambos")){
            System.out.print("\nJUEVES : ");
            for (int i = 0; i < n1.jueves.length; i++) {
                System.out.print(n1.jueves[i] + " ");
            }
            System.out.println("\nTu boleto es : ");
            for (int i = 0; i < n1.apuestas; i++) {
                System.out.print("Apuesta " + i + ": ");
                for (int j = 0; j < boleto[0].length; j++) {
                    System.out.print(boleto[i][j] + " ");
                }
                System.out.print("\t" + n1.comprobar(boleto[i], n1.jueves) + " Aciertos");
                System.out.println("");
            }
            reinJ=n1.comprobarRein(n1.reinJ, n1.rein);
            if(reinJ==true){
                System.out.println("Los reintegros SI coinciden (" + n1.rein + ")");
            }else{
                System.out.println("Los reintegros NO coinciden.");
            }
        }
        if(n1.sorteo.equals("sabado")||n1.sorteo.equals("ambos")){
            System.out.print("\nSABADO : ");
            for (int i = 0; i < n1.sabado.length; i++) {
                System.out.print(n1.sabado[i] + " ");
            }
            System.out.println("\nTu boleto es : ");
            for (int i = 0; i < n1.apuestas; i++) {
                System.out.print("Apuesta " + i + ": ");
                for (int j = 0; j < boleto[0].length; j++) {
                    System.out.print(boleto[i][j] + " ");
                }
                System.out.print("\t" + n1.comprobar(boleto[i], n1.sabado) + " Aciertos");
                System.out.println("");
            }
            reinS=n1.comprobarRein(n1.reinS, n1.rein);
            if(reinS==true){
                System.out.println("Los reintegros SI coinciden ( " + n1.rein + " )");
            }else{
                System.out.println("Los reintegros NO coinciden.");
            }
        }
        System.out.println("");
    }
}
