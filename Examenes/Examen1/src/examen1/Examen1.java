package examen1;

import java.util.*;

public class Examen1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Numero n1 = new Numero();
        boolean res;
        System.out.print("Introduce un numero : ");
        n1.setNum(leer.nextInt());
        res=n1.binario();
        if(res){
            System.out.println(n1.getNum() + " SI es MALVADO.");
        }else{
            System.out.println(n1.getNum() + " NO es MALVADO.");
        }
    }
}
