package palindromos;

import java.util.*;

public class Palindromos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CalcPal n1 = new CalcPal();
        boolean res;
        System.out.print("Introduce un numero : ");
        n1.setN(leer.nextInt());
        res=n1.isPalindrom();
        if(res==true){
            System.out.println(n1.n + " SII es palindromo.");
        }else{
            System.out.println(n1.n + " NOO es palindromo.");
        }
    }
}
